package MergeTwo;

import java.util.Arrays;

public class Naive {
    public static void MergingTwo(int array[], int array1[]){
        int newarray[] = new int[array.length + array1.length];
        for(int i = 0; i < array.length; i++)
            newarray[i] = array[i];
        for(int j = 0; j < array1.length; j++)
            newarray[j + array.length] = array1[j];

            Arrays.sort(newarray);
        
    }
    public static void main(String[] args) {
        int array[] = {10,15,20,40};
        int array1[] = {5,6,6,10,15};
        MergingTwo(array, array1);
    }
}
