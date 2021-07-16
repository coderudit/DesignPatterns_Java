package com.designpatterns.creational.singleton;

/**
 * This is lazy loaded and not thread-safe yet.
 * */
public class DbSingleton2 {
    private static DbSingleton2 instance = null;

    private DbSingleton2(){}

    public static DbSingleton2 getInstance(){
        if(instance== null)
            instance = new DbSingleton2();
        return instance;
    }
}
