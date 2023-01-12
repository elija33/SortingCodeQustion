package QuickSort;

public class QuickSortLomutoPartition {
    public static int QuickLomutoPartition(int array[], int left, int end){
        int pivot = array[end];
        int i = left - 1;

        for(int j = left; j <= end; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }

    public static void qSort(int array[], int left, int end){
        if(left < end){
            int partition = QuickLomutoPartition(array, left, end);
            qSort(array, left, partition-1); 
            qSort(array, partition + 1, end);
        }
    }
    public static void main(String[] args) {
        int array[] = {8, 4, 7, 9, 3, 10, 5};
        qSort(array, 0, array.length -1);

        for(int number : array)
            System.out.print(number+ " ");
    }
}
