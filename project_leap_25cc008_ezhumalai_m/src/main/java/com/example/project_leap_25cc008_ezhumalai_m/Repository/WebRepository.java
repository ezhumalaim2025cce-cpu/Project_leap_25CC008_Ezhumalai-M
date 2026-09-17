package com.example.project_leap_25cc008_ezhumalai_m.Repository;


import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository {
    String Writedata(String data);
    String readdata();

}
