package KthSmallestElement;

import java.util.Arrays;

public class NavieSmallest {
    public static int smallest(int array[], int target){
        Arrays.sort(array);
        return array[target - 1];
    }
    public static void main(String[] args) {
        int array[] = {10,3,4,5,11};
        System.out.println(smallest(array, 2));
    }
}
