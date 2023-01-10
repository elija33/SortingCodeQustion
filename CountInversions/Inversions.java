package CountInversions;

public class Inversions {
    public static int CountInversion(int array[]){
        int count = 0;
        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    count++;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int array[] ={2,4,1,3,5};
        System.out.println(CountInversion(array));
    }
}
