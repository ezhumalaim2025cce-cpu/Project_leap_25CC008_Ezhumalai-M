package com.example.project_leap_25cc008_ezhumalai_m.Services.Impl;

import com.example.project_leap_25cc008_ezhumalai_m.Repository.Impl.WebRepositoryImpl;
import com.example.project_leap_25cc008_ezhumalai_m.Repository.WebRepository;
import com.example.project_leap_25cc008_ezhumalai_m.Services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {
    @Autowired
    WebRepository webRepository;

    @Override
    public String Writedata(String data) {
        WebRepository webrepository= new WebRepositoryImpl();
        return webrepository.Writedata(data);
    }

    @Override
    public String readdata() {
        WebRepository webrepository= new WebRepositoryImpl();
        return webrepository.readdata();

    }
}
