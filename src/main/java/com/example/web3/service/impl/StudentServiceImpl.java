package com.example.web3.service.impl;

import com.example.web3.entity.Student;
import com.example.web3.mapper.StudentMapper;
import com.example.web3.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xue
 * @since 2024-05-27
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
