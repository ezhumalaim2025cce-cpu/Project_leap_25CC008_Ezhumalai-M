package com.example.project_leap_25cc008_ezhumalai_m.Controller;


import com.example.project_leap_25cc008_ezhumalai_m.Services.Impl.WebServiceImpl;
import com.example.project_leap_25cc008_ezhumalai_m.Services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    WebService webservice;

    @PostMapping("/data/write")
    String Writedata(String data){
        WebService webservice=new WebServiceImpl();
        return webservice.Writedata(data);

    }
    @GetMapping("/data/get")
    String getdata(){
        WebService webservice=new WebServiceImpl();
        return webservice.readdata();
    }

}
