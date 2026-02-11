package com.jsp;

import com.qsp.Music;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Music m = context.getBean(Music.class);

        m.setSingerName("Atif Aslam");
        m.setMusicType("sofi");

        System.out.println(m.getSingerName());
        System.out.println(m.getMusicType());

        context.close();
        System.out.println("closed");

    }
}
