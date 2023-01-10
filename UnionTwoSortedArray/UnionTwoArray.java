package UnionTwoSortedArray;

import java.util.HashSet;

public class UnionTwoArray {
    public static int findUnion(int array[], int array1[]){
        HashSet<Integer> union = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            union.add(array[i]);
        }

        for(int j = 0; j < array1.length; j++){
            union.add(array1[j]);
        }
        return union.size();
    }
    public static void main(String[] args) {
        int array[] = {3,5,8};
        int array1[] = {2,8,9,10,15};
        System.out.println(findUnion(array, array1));
    }
}
