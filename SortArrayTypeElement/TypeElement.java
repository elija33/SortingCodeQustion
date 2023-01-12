package SortArrayTypeElement;

import BubbleSort.Sort;

public class TypeElement {
    public static void element(int array[]){
        int temparray[] = new int[array.length];
        int i = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j] < 0){
                temparray[i++] = array[j];
            }
        }
        for(int j = 0; j < array.length; j++){
            if(array[j] > 0){
                temparray[i++] = array[j];
            }
        }
        for(int j = 0; j < array.length; j++){
            array[j] = temparray[j];
        }
    }
    public static void main(String[] args) {
        int array[] = {13, -12, 18, -10};
        element(array);
        for(int number : array)
            System.out.print(number+ " ");
    }
}
