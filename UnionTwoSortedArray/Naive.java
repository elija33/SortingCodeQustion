package UnionTwoSortedArray;

import java.util.Arrays;

public class Naive {
    public static void findUnion(int array[], int array1[]){
        int totaarray[] = new int[array.length + array1.length];
        for(int i = 0; i < array.length; i++){
            totaarray[i] = array[i];
        }
        for(int j = 0; j < array1.length; j++){
            totaarray[array.length+1] = array1[j];
        }
        Arrays.sort(totaarray);
        for(int i = 0; i < totaarray.length; i++){
            if(i == 0 || totaarray[i] != totaarray[i - 1]){
                System.out.print(totaarray[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {10,20,20};
        int array1[] = {5,20,40,40};
        findUnion(array, array1);
    }
}
