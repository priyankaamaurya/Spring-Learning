package com.qsp;

import org.springframework.stereotype.Component;

@Component
public class University {

    private String universityName;
    private String location;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
