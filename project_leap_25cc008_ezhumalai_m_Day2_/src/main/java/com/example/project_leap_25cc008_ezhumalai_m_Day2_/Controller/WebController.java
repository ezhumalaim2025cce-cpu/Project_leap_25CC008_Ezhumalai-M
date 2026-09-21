package com.example.project_leap_25cc008_ezhumalai_m_Day2_.Controller;

import com.example.project_leap_25cc008_ezhumalai_m_Day2_.Services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    WebService webService;
    @PostMapping("/data")
    String writeData(String data)
    {
        return webService.writeData(data);
    }
    @GetMapping("/write")
    String getData()
    {

        return webService.readData();
    }
}
