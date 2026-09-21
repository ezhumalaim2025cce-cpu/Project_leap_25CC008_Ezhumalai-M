package com.example.project_leap_25cc008_ezhumalai_m_Day3_.Controller;

import com.example.project_leap_25cc008_ezhumalai_m_Day3_.Model.Student;
import com.example.project_leap_25cc008_ezhumalai_m_Day3_.Services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    WebService webService;
    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return webService.saveStudent(student);
    }
    @GetMapping("/Details")
    List<Student> studentDetails(){
        return webService.readStudents();
    }
}

