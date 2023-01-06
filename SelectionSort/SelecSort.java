package SelectionSort;

import java.util.Arrays;

public class SelecSort {
    public static void Sorting(int array[]){
        for(int i = 0; i < array.length-1; i++){
            int rest = i;

            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[rest]){
                    rest = j;
                }
            }
            int temp = array[i];
            array[i] = array[rest];
            array[rest] = temp;
        }
    }
    public static void main(String[] args) {
        int array[] = {20, 12, 10, 30, 3, 1, 2, 25, 15, 2};
        Sorting(array);
        System.out.println(Arrays.toString(array));    
    }
}
