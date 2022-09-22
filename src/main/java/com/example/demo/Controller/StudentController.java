package com.example.demo.Controller;

import com.example.demo.Domain.StudentDao;
import com.example.demo.Domain.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/class")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public List<StudentDao> getAllStudent(){
        return this.studentRepository.findAll();
    }

    @PostMapping("/student")
    public StudentDao createStudent(@RequestBody StudentDao studentDao){
        return this.studentRepository.save(studentDao);
    }

}
