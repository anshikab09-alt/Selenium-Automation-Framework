package com.example.Demo;
public class CoreJavaString{
    public static void main(String[] args){
        String s = "Anshika Anush Bharti";
        System.out.println(s);
        
        //Split the String from Anush --- used split method with object name of String class -- 
        //split the string and stored in an array -- 
        String[] splittedString = s.split("Anush");

        //After splitted it breaks into 2 index -- 0(Anshika) or 1(Bharti) 

    System.out.println(splittedString[0]);
    System.out.println(splittedString[1]);

    // when index 0 or 1 prints there is white space is at 1 index so we remove the white space by using trim method 

    System.out.println(splittedString[1].trim());

    //Reverse the string --
    for(int i = s.length()-1 ; i>=0; i--){
        System.out.println(s.charAt(i));
    }


    }
}