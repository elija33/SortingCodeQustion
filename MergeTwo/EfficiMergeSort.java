package MergeTwo;

public class EfficiMergeSort {
    public static void MergeSort(int array[], int array1[]){
        int i = 0;
        int j = 0;
        while(i < array.length && j < array1.length){
            if(array[i] <= array1[j]){
                System.out.println(array[i++]+ " ");
            }
            else{
                System.out.println(array1[j++]+ " ");
            }
        }
        while(i < array.length){
            System.out.println(array[i++]+ " ");
        }
        while(j < array1.length){
            System.out.println(array1[j++]+ " ");
        }
    }
    public static void main(String[] args) {
        int array[] = new int[]{10,15,20,40};
        int array1[] = new int[]{5,6,6,10,15};
        MergeSort(array, array1);
    }
}
