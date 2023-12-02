package org.example.main;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p1 = context.getBean("parrot1", Parrot.class);
        System.out.println(p1);

        Parrot p2 = context.getBean("parrot2", Parrot.class);
        System.out.println(p2);

        Integer int1 = context.getBean(Integer.class);
        System.out.println(int1);

        // S. 36
    }
}