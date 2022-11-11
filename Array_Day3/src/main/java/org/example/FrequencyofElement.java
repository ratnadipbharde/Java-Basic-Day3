package org.example;

public class FrequencyofElement {
    int[] array =  { 3, 5, 8, 6, 7, 5, 9, 1, 2, 3, 5, 4, 6, 8, 1 , 6, 1 };

    public void frequency(){
        int count=0;
        int flag=0;
        for (int i = 0; i < array.length ; i++)
        {

            for (int k = 0; k < i; k++) {
                if (array[k] == array[i]) {
                    flag=1;
                }
            }
            for (int j = i; j < array.length ; j++)
            {
                if (array[j] ==array[i])
                {
                    count++;
                }
            }
            if (flag==0) {
                System.out.println("element: " + array[i] + " Frequency: " + count);
            }
                count=0;
                flag=0;

        }

    }

}

