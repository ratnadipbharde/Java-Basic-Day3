package org.example;

public class FindSecondLargestElement {
    int[] array = {3, 5, 8, 6, 8, 6, 7, 5, 9, 1, 2, 3};
    int temp = 0;
    public void secongLargest() {
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Second largest Element in Array is :- " + array[array.length-2]);


    }
}
