package com.jsp.config;

import com.jsp.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan (basePackages = "com")
@Configuration

public class Config {

    @Bean(value="student")
    @Scope(value ="prototype")
    public Student student(){
        return new Student();
    }

}
