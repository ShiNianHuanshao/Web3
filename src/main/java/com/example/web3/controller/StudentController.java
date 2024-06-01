package com.example.web3.controller;


import com.example.web3.entity.Student;
import com.example.web3.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xue
 * @since 2024-05-27
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentService studentService;
    @PostMapping("/add")//增加学生
    @CrossOrigin
    public ResponseEntity<?> postUser(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }
    @PostMapping("/delete")//删除学生
    @CrossOrigin
    public ResponseEntity<?> deleteUser(@RequestBody Student student) {
        System.out.println(student);
        return ResponseEntity.ok(studentService.removeById(student));
    }
    @PostMapping("/update")//修改学生
    @CrossOrigin
    public ResponseEntity<?> updateUser(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateById(student));
    }
    @GetMapping("/get")//获取学生
    @CrossOrigin
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok(studentService.lambdaQuery().list());
    }
}
