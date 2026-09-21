package com.example.project_leap_25cc008_ezhumalai_m_Day3_.Repository.Impl;

import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Repository
public class WebRepositoryImpl implements WebRepository {
    @Override
    public String writeData(String data)
    {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write(data);
            writer.close();

            return "Data written successfully";
        }
        catch(IOException e) {
            return "An Error occured " + e.getLocalizedMessage();
        }

    }
    @Override
    public String readData(){
        try {
            return Files.readString(Path.of("data.txt"));
        }
        catch(IOException e) {
            return "An Error occured " + e.getLocalizedMessage();
        }
    }
}

