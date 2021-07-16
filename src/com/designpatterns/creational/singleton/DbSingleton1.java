package com.designpatterns.creational.singleton;

/**
 * This is eagerly loaded(Using this approach, we rely on the JVM to create the unique instance of the Singleton when
 * the class is loaded. The JVM guarantees that the instance will be created before any thread
 * accesses the static uniqueInstance variable.) and thread-safe.
 * */
public class DbSingleton1 {
    private static DbSingleton1 instance = new DbSingleton1();

    private DbSingleton1(){}

    public static DbSingleton1 getInstance(){
        return instance;
    }
}
