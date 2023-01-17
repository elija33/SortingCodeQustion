package BubbleSort;

public class NavieBubbleSort {
    public static void BubbleSort(int array[]){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {4,1,5,3,8,2,10,9};
        BubbleSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        
    }
}
