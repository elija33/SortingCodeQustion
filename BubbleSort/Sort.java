package BubbleSort;

import java.util.Arrays;

public class Sort {
    public static void BubbleSort(int array[]){
        boolean swapped = true;
        while(swapped){
            swapped = false;
        for(int i = 0; i < array.length-i-1; i++){
                if(array[i] > array[i + 1]){
                    swapped = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
            }
        } 
    }
    }
     public static void main(String[] args) {
        int array[] = {2, 1, 4, 3};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
     }
}