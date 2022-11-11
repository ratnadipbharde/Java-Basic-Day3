package org.example;

public class evenPositionArray {
    int[] array = {1,2,3,4,5,6,7,8,9};

    public void evenPosition(){
        System.out.println("elements of an array present on an even position is :- ");
        for (int i = 0; i < array.length ; i++) {
            if (i%2 != 0)
            {
                System.out.print(" "+array[i]);
            }
        }
        System.out.println();
    }
}
