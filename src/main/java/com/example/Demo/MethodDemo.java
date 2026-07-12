package com.example.Demo;
public class MethodDemo{
    public static void main(String[] args){
        //Why method -- 
        // If we have to use method first we have create objects -- 
        MethodDemo d  = new MethodDemo();
         // Calling getData()
        d.getData();
        // Calling getData2()
        System.out.println(d.getData2());
         // Calling getData3()
        System.out.println(d.getData3());

        // Calling static method
        System.out.println(getData4());
       
    }
    //create method outside the main block -- 
    public void getData(){
        System.out.println("Hello world");
    }
    public int getData2(){
        int a = 7;
        return a;
        
    }
    public String getData3(){
        return "anshika";
    }
    public static String getData4(){
        System.out.println("Hello world");
        return "anshika";
    }
}