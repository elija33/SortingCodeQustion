package KthSmallestElement;

public class EfficientSmallestElement {
    public static int EfficientSmallest(int array[], int start, int end){
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j <= end - 1; j++){
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

    public static int kthSmallest(int array[], int n, int target){
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int partition = EfficientSmallest(array, start, end);
            if(partition == target -1){
                return partition;
            }
            else if(partition > target - 1){
                end = partition - 1;
            }
            else{
                start = partition + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {10,4,5,8,11,6,26};
        int target = 4;
        int n = array.length;
        int indexs = kthSmallest(array, n, target);
        System.out.println(array[indexs]);
    }
}
