package org.example;

public class reverseArray {
    int[] array = {1,2,3,4,5};

    public void reverse() {
        System.out.println("array in reverse order:- ");
        for (int i = (array.length - 1); i >= 0 ; i--) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
}
