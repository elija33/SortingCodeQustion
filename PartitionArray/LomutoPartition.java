package PartitionArray;

public class LomutoPartition {
    public static int lomutoP(int array[], int left, int right){
        int pivot = array[right];
        int i = left -1;
        for(int j = left; j <= right-1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int array[] = {10, 80, 30, 90, 40, 50, 70};
        int n = array.length;
        lomutoP(array, 0, n -1);

        for(int numner : array)
        System.out.print(numner+ " ");
    }
}
