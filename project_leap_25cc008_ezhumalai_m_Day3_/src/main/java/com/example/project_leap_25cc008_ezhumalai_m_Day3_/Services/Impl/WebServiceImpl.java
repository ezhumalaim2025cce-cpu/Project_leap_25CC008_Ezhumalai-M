package com.example.project_leap_25cc008_ezhumalai_m_Day3_.Services.Impl;

import com.example.project_leap_25cc008_ezhumalai_m_Day3_.Model.Student;
import com.example.project_leap_25cc008_ezhumalai_m_Day3_.Repository.WebRepository;
import com.example.project_leap_25cc008_ezhumalai_m_Day3_.Services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WebServiceImpl implements WebService {
    @Autowired
    private WebRepository webRepository;


    @Override
    public Student saveStudent(Student student) {
        return webRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        webRepository.deleteById(id);
    }

    @Override
    public List<Student> readStudents() {
        return webRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return webRepository.save(student);
    }
}

