package com.example.project_leap_25cc008_ezhumalai_m.Repository.Impl;

import com.example.project_leap_25cc008_ezhumalai_m.Repository.WebRepository;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Repository
public class WebRepositoryImpl implements WebRepository {


    @Override
    public String Writedata(String data) {
        try{
            FileWriter writer=new FileWriter("data.txt");
            writer.write(data);
            writer.close();
            return "Data Written Successfully";
        }
        catch(IOException e){
            return "An Error occured"+e.getMessage();
        }
    }

    @Override
    public String readdata() {
        try {
            return Files.readString(Paths.get("data.txt"));
        }
        catch (IOException e){
            return "An Error occured"+e.getMessage();
        }



    }
}
