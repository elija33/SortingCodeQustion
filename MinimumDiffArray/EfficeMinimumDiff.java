package MinimumDiffArray;

import java.util.Arrays;

public class EfficeMinimumDiff {
    public static int Minimumdiff(int array[]){
        Arrays.sort(array);
        int rest = Integer.MAX_VALUE;
        for(int i = 1; i < array.length; i++){
            rest = Math.min(rest, array[i] - array[i - 1]);
        }
        return rest;
    }
    public static void main(String[] args) {
        int array[] = {1, 8, 12, 5, 18};
        System.out.println(Minimumdiff(array));
    }
}
