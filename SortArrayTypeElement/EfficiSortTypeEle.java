package SortArrayTypeElement;

public class EfficiSortTypeEle {
    public static void SortTypeEle(int array[]){
        int i = -1;
        int j = array.length;
        while(true){
            do{
                i++;
            }
            while(array[i] < 0);

            do{
                j--;
            }
            while(array[j] >= 0);
            if(i >= j)
                return;

            int temp = array[i];
        }
    }
    public static void main(String[] args) {
        
    }
}
