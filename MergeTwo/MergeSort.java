package MergeTwo;

import java.security.Identity;

public class MergeSort {
    public static void Sorts(int array[], int start, int end, int mid){
        int first = mid-start+1;
        int last = end - mid;
        int firstArray[] = new int[first];
        int lastArray[] = new int[last];
        for(int i = 0; i < first; i++)
            firstArray[i] = array[i + start];
        for(int j = 0; j < last; j++)
            lastArray[j] = array[mid+1+j];
        int i = 0, j = 0, k = start;
        while(i < first && j < last){
            if(firstArray[i] <= lastArray[j])
                array[k++] = firstArray[i++];
            else
                array[k++] = lastArray[j++];
        }
        while(i < first)
            array[k++] = firstArray[i++];
        while(j < last)
            array[k++] = lastArray[j++];
    }
    public static void Sort(int array[], int start, int end){
        if(start < end){
            int mid = end + (start - end) / 2;
            Sort(array, start, mid);
            Sort(array, mid + 1, end);
            Sorts(array, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int array[] = new int[]{10,5,30,15,7};
        Sort(array, 0, 0);
    }
}
