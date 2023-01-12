package SortArrayThreeEle;

public class NaiveThreeEle {
    public static void ThreeElement(int array[]){
        int temp[] = new int[array.length];
        int i = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j] == 0){
                temp[i++] = array[j];
            }
        }
        for(int j = 0; j < array.length; j++){
            if(array[j] == 1){
                temp[i++] = array[j];
            }
        }
        for(int k = 0; k < array.length; k++){
            if(array[k] == 2){
                temp[i++] = array[k];
            }
        }
        for(int j = 0; j < array.length; i++){
            array[j] = temp[j];
        }
    }
    public static void main(String[] args) {
        int array[] = {0,1,1,2,0,1,1,2};
        ThreeElement(array);
        for(int number : array)
            System.out.print(number+ " ");
    }
}
