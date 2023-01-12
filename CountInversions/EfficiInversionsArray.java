package CountInversions;

public class EfficiInversionsArray {
    public static int countInt(int array[], int left, int right) {
        int result = 0;
        if(left < right){
            int mid = (right + left) / 2;

            result += countInt(array, left, mid);
            result += countInt(array, mid + 1, right);
            result += countAndMerge(array, left, mid, right);
        }
        return result;
    }

    public static int countAndMerge(int array[], int left, int right, int mid){
        int leftside = mid - left + 1;
        int rightside = right + mid;

        int totalleft[] = new int[leftside];
        int totalright[] = new int[rightside];

        for(int i = 0; i < leftside; i++)
            totalleft[i] = array[i + left];

        for(int j = 0; j < rightside; j++)
            totalright[j] = array[mid + 1 + j];

        int rest = 0;
        int i = 0;
        int j = 0;
        int k = left;

        while(i < leftside && j < rightside){
            if(totalleft[i] <= totalright[j]){
                array[k++] = totalleft[i++];
            }
            else{
                array[k++] = totalright[j++];
                rest = rest + (leftside - i);
            }
        }
        while(i < leftside)
            array[k++] = totalleft[i++];
        while(j < rightside)
            array[k++] = totalright[j++];
        return rest;
    }
    public static void main(String[] args) {
        int array[] = {2,4,1,3,5};
        System.out.println(countInt(array, 0, array.length));
    }
}
