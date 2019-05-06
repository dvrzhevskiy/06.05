package ru.itmonopoly.myspring;

import javax.annotation.Resource;

public class MyLogic {
    @Resource
    private MyConnection myConnection;


    public void selectUsers(){
        System.out.println(myConnection);
    }
}
