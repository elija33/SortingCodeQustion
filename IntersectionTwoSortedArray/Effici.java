package IntersectionTwoSortedArray;

import java.util.HashSet;

public class Effici {
    public static int findIntersection(int array[], int array1[]){
        HashSet<Integer> Inter = new HashSet<>();
        for(int i = 0; i < array.length; i++)
            Inter.add(array[i]);
            int res = 0;
        for(int j = 0; j < array1.length; j++){
            if(Inter.contains(array1)){
                res++;
                Inter.remove(array1[j]);
        }  
        
    }
    return res;
}
    public static void main(String[] args) {
        int array[] = {15, 17, 27, 27, 28, 15};
        int array1[] = {16, 17, 28, 17, 31, 17};
        System.out.println(findIntersection(array, array1));
    }
}
