package SortArrayThreeEle;

public class EfficiArrayThreeElement {
    public static void SortThreeElement(int array[]){
        int left = 0;
        int right = array.length;
        int mid = 0;
        while(mid <= right){
            switch(array[mid]){
                case 0:
                    int temp = array[left];
                    array[left] = array[mid];
                    array[mid] = temp;
                    left++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = array[right];
                    array[right] = array[mid];
                    array[mid] = temp;
                    right++;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {0,1,1,2,0,1,1,2};
        SortThreeElement(array);
        for(int number : array)
            System.out.println(number+ " ");
    }
}
