package CountingSort;

public class CountSort {
    public static void countSort(int array[], int target){
        int count[] = new int[target];
        for(int i = 0; i < target; i++)
            count[i] = 0;
        for(int i = 0; i < array.length; i++)
            count[array[i]]++;

        int index = 0;
        for(int i = 0; i < target; i++){
            for(int j = 0; j < count[i]; j++){
                array[index] = i;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {1,4,4,1,0,1};
        int target = 5;
        countSort(array, target);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+ " ");
    }
}
