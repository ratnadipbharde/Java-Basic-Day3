package org.example;

public class Main {
    public static void main(String[] args) {
        //prog 1) Java Program to print the elements of an array
        PrintArrayElement obj1=new PrintArrayElement();
        obj1.print();
        System.out.println("------------------------------");

 	    //prog 2) Java Program to find the frequency of each element in the array
        FrequencyofElement obj2=new FrequencyofElement();
        obj2.frequency();
        System.out.println("------------------------------");

        //prog 3) Java Program to print the largest element in an array
        largestElement obj3=new largestElement();
        obj3.largest();
        System.out.println("------------------------------");
    }
}