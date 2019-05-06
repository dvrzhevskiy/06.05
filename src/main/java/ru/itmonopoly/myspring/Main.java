package ru.itmonopoly.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
//https://docs.spring.io/spring/docs/4.3.x/spring-framework-reference/htmlsingle/#beans-basics
    public static void main(String[] args) {
        ApplicationContext context =

                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");

        MyLogic myLogic = context.getBean(MyLogic.class);
        myLogic.selectUsers();
    }
}
