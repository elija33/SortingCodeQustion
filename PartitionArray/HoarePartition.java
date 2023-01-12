package PartitionArray;

public class HoarePartition {
    public static int partition(int array[], int left, int right){
        int pivot = array[left];
        int i = left - 1;
        int j = right + 1;

        while(true){
            do{
                i++;
            }
            while(array[i] < pivot);
            do{
                j--;
            }
            while(array[j] > pivot);
            if(i >= j){
                return j;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void main(String[] args) {
        int array[] = {5,3,8,4,2,7,1,10};

        int n = array.length;
        partition(array, 0, n-1);

        for(int number : array)
        System.out.print(number+ " ");   
    }
}