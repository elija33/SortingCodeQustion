package UnionTwoSortedArray;

public class EfficiUnion {
    public static void findUnion(int array[], int array1[]){
        int i = 0; 
        int j = 0;
        while(i < array.length && j < array1.length){
            if(i > 0 && array[i-1] == array[i]){
                i++;
                continue;
            }
            if(j > 0 && array1[j-1] == array1[j]){
                j++; 
                continue;
            }
            if(array[i] < array1[j]){
                System.out.print(array[i]+ " ");
                i++;
            }
            else if(array[i] > array1[j]){
                System.out.print(array1[j]+ " ");
                j++;
            }
            else{System.out.print(array[i]+ " ");
                i++;
                j++;
            }
        }
            while(i<array.length){
                if(i == 0 || array[i] != array[i-1])
                    System.out.print(array[i]+ " ");
                        i++;
            }
            while(j< array1.length){
                if(j==0||array1[j]!=array1[j-1])
                    System.out.print(array1[j]+" ");
                        j++;}
    }
    public static void main(String[] args) {
        int array[] = {2,3,4,5,8,9};
        int array1[] = {1,2,3,4,4,5};
        findUnion(array, array1);
    }
}
