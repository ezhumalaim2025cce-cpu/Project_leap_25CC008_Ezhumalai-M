package com.example.project_leap_25cc008_ezhumalai_m_Day2_.Services.Impl;

import com.example.project_leap_25cc008_ezhumalai_m_Day2_.Repository.WebRepository;
import com.example.project_leap_25cc008_ezhumalai_m_Day2_.Services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {
    @Autowired
    WebRepository webRepository;
    @Override
    public String writeData(String text)
    {
        return webRepository.writeData(text);

    }
    public String readData()
    {
        return webRepository.readData();
    }
}
