package MinimumDiffArray;

public class NavieMinimumDiff {
    public static int findMinimum(int array[]){
        int rest = Integer.MAX_VALUE;
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < i; j++){
                rest = Math.min(rest, Math.abs(array[i] - array[j]));
            }
        }
        return rest;
    }
    public static void main(String[] args) {
        int array[] = {1, 8, 12, 5, 18};
        System.out.println(findMinimum(array));
    }
}
