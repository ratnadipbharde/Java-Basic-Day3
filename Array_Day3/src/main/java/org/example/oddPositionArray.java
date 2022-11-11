package org.example;

public class oddPositionArray {
    int[] array = {1,2,3,4,5,6,7,8,9};

    public void oddPosition(){
        System.out.println("elements of an array present on an odd position is :- ");
        for (int i = 0; i < array.length ; i++) {
            if (i%2 == 0)
            {
                System.out.print(" "+array[i]);
            }
        }
        System.out.println();
    }
}
