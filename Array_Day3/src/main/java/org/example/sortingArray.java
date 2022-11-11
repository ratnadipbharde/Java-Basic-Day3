package org.example;

public class sortingArray {
    int[] array =  { 3, 5, 8, 6, 8, 6, 7, 5, 9, 1, 2, 3 };
    int temp=0;
    public void sort(){
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("sorted Array :- ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
