package ChocolateDistribuProblem;

import java.util.Arrays;

public class DistribuProblem {
    public static int distribution(int array[], int target){
        if(target > array.length){
            return -1;
        }
        Arrays.sort(array);
        int rest = array[target - 1] - array[0];
        for(int i = 1; (i + target -1) < array.length; i++)
            rest = Math.min(rest, array[i + target - 1] - array[i]);
        return rest;
    }
    public static void main(String[] args) {
        int array[] = {7,3,1,8,9,12,56};
        int target = 3;
        System.out.println(distribution(array, target));
    }
}
