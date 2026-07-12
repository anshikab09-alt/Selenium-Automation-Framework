package com.example.Demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListBrusUp{
    public static void main(String[] args){
    ArrayList<String> a = new ArrayList<String>();
    a.add("Anshika");
    a.add("Bharti");
    a.add("Ansh");

    System.out.println(a);
    System.out.println("**********");
    for(int i=0; i<a.size(); i++){
        System.out.println(a.get(i));
    }
    System.out.println("**********");

    //Enhanced for loop 
    for(String var : a){
        System.out.println(var);
    }

    // we have to check item is present in array list or not --- 
    System.out.println(a.contains("Anshika")); // this method returns true if it is present otherwise returs false 

//Convert arrays class into arrayslist -- there is one method asList() -- list size is fixed it cannot be changed 
String[] name = {"anshika","bharti","ansh"};
List<String> nameArrayList = Arrays.asList(name);
nameArrayList.contains("anshika");


    }

}