package IntersectionTwoSortedArray;

public class BestIntersection {
    public static void Intersect(int array[], int array1[]){
        int i = 0, j = 0;
        while(i < array.length && j < array1.length){
            if(i > 0 && array[i] == array[i - 1]){
                i++; 
                continue;
            }
            if(array[i] < array1[j]){
                i++;
            }
            else if(array[i] > array1[j]){
                j++;
            }
            else{
                System.out.print(array[i] + " " );
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int array[] = new int[]{3,5,10,10,10,15,15,20};
        int array1[] = new int[]{5,10,10,15,30};
        Intersect(array, array1);
    }
}
