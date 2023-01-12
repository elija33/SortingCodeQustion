package PartitionArray;

import java.util.Arrays;

public class NaivePartition {
    public static void findPartition(int array[], int left, int right, int patition){
        int temp[] = new int[right - left + 1];
        int index = 0;
        for(int i = left; i <= right; i++)
            if(array[i] <= array[patition] && i != patition){
                temp[index] = array[i];
                index++;
            }
        temp[index++] = array[patition];
        for(int i = left; i <= right; i++)
            if(array[i] > array[patition]){
                temp[index] = array[i];
                index++;
            }
        
        for(int i = left; i <= right; i++)
            array[i] = temp[i - left];
        
    }
    public static void main(String[] args) {
        int array[] = {5,13,6,9,12,11,18};
        int n = array.length;
        findPartition(array, 0, n-1, n-1);
        for(int done : array){
            System.out.print(done+ " ");
        }
        
    }
}
