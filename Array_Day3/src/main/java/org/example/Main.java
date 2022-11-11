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
        
        //prog 4) Java Program to print the smallest element in an array
        SmallestElement obj4=new SmallestElement();
        obj4.smallest();
        System.out.println("------------------------------");

        //prog 5) Java Program to print the elements of an array present on an even position
        evenPositionArray obj5=new evenPositionArray();
        obj5.evenPosition();
        System.out.println("------------------------------");
        
        //prog 6) Java Program to print the elements of an array in reverse order
        reverseArray obj6=new reverseArray();
        obj6.reverse();
        System.out.println("------------------------------");

        //prog 7) Java Program to print the elements of an array present on odd position
        oddPositionArray obj7=new oddPositionArray();
        obj7.oddPosition();
        System.out.println("------------------------------");
        
        //prog 8) Java Program to print the duplicate elements of an array
        duplicateElementArray obj8=new duplicateElementArray();
        obj8.duplicate();
        System.out.println("------------------------------");
        
        //prog 9) Java Program to sort the elements of an array in ascending order
        sortingArray obj9=new sortingArray();
        obj9.sort();
        System.out.println("------------------------------");

        //prog 10) Find 2nd Largest Number in an Array
        FindSecondLargestElement obj10=new FindSecondLargestElement();
        obj10.secongLargest();
    }
}