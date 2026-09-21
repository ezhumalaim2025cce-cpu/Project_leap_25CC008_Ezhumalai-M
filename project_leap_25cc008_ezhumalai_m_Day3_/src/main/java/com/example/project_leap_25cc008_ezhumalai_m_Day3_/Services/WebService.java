package com.example.project_leap_25cc008_ezhumalai_m_Day3_.Services;

import com.example.project_leap_25cc008_ezhumalai_m_Day3_.Model.Student;

import java.util.List;

public interface WebService {
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> readStudents();
    Student updateStudent(Student student);
}