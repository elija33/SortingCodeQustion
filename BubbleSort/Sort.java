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
        int array[] = {7,4,1,5,3,8,6,2,10,9};
        BubbleSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
     }
}