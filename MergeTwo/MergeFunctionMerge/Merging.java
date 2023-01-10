package MergeTwo.MergeFunctionMerge;

public class Merging {
    public static int MergingTwoArray(int array[]){
        int start = 0, end = array.length;
        int mid = (start + end) / 2;
        int right[] = new int [(mid + 1) + end];
        int left[] = new int[start + mid];
        for(int i = 0; i < left.length; i++)
            left[i] = array[start + mid];
        for(int j = 0; j < right.length; j++)
            right[j] = array[(mid + 1 + end)];
            int i = 0, k = 0;
        while(i < left && j < right){
            
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
