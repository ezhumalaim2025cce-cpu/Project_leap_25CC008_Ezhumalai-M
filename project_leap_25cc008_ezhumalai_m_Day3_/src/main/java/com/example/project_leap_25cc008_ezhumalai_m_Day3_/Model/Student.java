package com.example.project_leap_25cc008_ezhumalai_m_Day3_.Model;

@Entity
@Table(name="student")
public class Student {
    @Id
    private String name;
    private long id;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }
}

