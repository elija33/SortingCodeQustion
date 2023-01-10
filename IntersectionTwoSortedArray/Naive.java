package IntersectionTwoSortedArray;

public class Naive {
    public static void Intersect(int array[], int array1[]){
        for(int i = 0; i < array.length; i++){
            if(i > 0 && array[i] == array1[i - 1])
                continue;
            for(int j = 0; j < array1.length; j++){
                if(array[i] == array1[j]){
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {1, 20, 20, 40, 60};
        int array1[] = {2,20,20,20};
        Intersect(array, array1);
    }
}
