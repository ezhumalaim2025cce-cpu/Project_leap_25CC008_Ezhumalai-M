package com.example.project_leap_25cc008_ezhumalai_m_Day2_.Repository;

import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository {
    String writeData(String data);
    String readData();
}
