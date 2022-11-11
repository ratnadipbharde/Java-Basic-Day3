package org.example;

public class PrintArrayElement {
    int[] array = {1,2,3,4,5};

        public void print(){
            System.out.println("array element is");
//            for (int i = 0; i < array.length ; i++) {
 //           System.out.println(array[i]);
//            }
            for (int i:array) {
                System.out.println(i);
            }
        }
}
