package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj=new RWOnly();
//        obj.name="Abhishek";
//        System.out.println(obj.name);
        // Error: java: name has private access in com.driver.RWOnly
        obj.setName("Abhishek");
        String name=obj.getName();
        System.out.println(name);

    }
  
}