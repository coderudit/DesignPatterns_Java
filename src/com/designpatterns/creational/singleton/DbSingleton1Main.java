package com.designpatterns.creational.singleton;

public class DbSingleton1Main {
    public static void main(String[] args){
        var dbSingleton1Instance1 = DbSingleton1.getInstance();
        var dbSingleton1Instance2 = DbSingleton1.getInstance();
        System.out.println(dbSingleton1Instance1);
        if(dbSingleton1Instance1 == dbSingleton1Instance2)
        {
            System.out.println("Both instances are same.");
        }

        DbSingleton1 dbInstance  = DbSingleton1.getInstance();
    }
}
