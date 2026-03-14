package com.klu.Skill5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("student.xml");

        Student s = (Student) context.getBean("student");

        s.display();
    }
}