package com.designpatterns.creational.singleton;

public class DbSingleton2Main {
    public static void main(String[] args){
        var dbSingleton2Instance1 = DbSingleton2.getInstance();
        var dbSingleton2Instance2 = DbSingleton2.getInstance();
        System.out.println(dbSingleton2Instance1);
        if(dbSingleton2Instance1 == dbSingleton2Instance2)
        {
            System.out.println("Both instances are same.");
        }
    }
}
