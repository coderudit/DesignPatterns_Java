package com.designpatterns.creational.builder;

public class LunchOrder1Demo {
    public static void main(String[] args){
        LunchOrder1 lunchOrder = new LunchOrder1();
        lunchOrder.setBread("Wheat");
        lunchOrder.setCondiments("Lettuce");
        lunchOrder.setDressing("Mustard");
        lunchOrder.setMeat("Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
