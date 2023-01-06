package InsertionSort;

import java.util.Arrays;

public class InsertSort {
    public static void Insert(int array[]){
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int array[] = {50,20,40,60,10,30};
        Insert(array);
        System.out.println(Arrays.toString(array));
    }
}
