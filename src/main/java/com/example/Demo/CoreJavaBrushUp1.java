package com.example.Demo;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        // Example of a simple Java program
        //variable --if we want to store a value we can use variable and also declare data type of variable
        
        //int, String, char, float, double, boolean
        int numb= 10;
        System.out.println("The value of numb is: " + numb);
        String name = "Anshika";
        System.out.println("The name is: " + name);
        char letter = 'A';
        System.out.println("The letter is: " + letter);
        float decimal = 3.14f;
        System.out.println("The decimal value is: " + decimal);
        double bigDecimal = 3.14159;
        System.out.println("The big decimal value is: " + bigDecimal);
        boolean isTrue = true;
        System.out.println("The boolean value is: " + isTrue);

        //Arrays - Store multiple values in a single variable-
        int[] arr = new int[5]; // new is used to create an array and create memory for it
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("The value at index 2 is: " + arr[2]);
        System.out.println("The value at index 3 is: " + arr[3]);
        System.out.println("The value at index 4 is: " + arr[4]);   


         //Retrieve the value of an array
        int[] arr2 ={1, 2, 3, 4, 5,6,7,8,9,10}; // we can also declare and initialize an array in a single line
        System.out.println("The value of index 2 is :" + arr2[2]);


        //for loop - used to iterate over a block of code a number of times
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        String[] nam = {"Anshika", "Anshika1", "Anshika2", "Anshika3", "Anshika4"};
        for(int i =0; i<nam.length; i++){
            System.out.println(nam[i]);
        }

        //Enhanced for loop 
        for(String s : nam ){
            System.out.println(s);
        }

    }
}