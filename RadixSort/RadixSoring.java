package RadixSort;

public class RadixSoring {
    
    public static void Radix(int array[], int exp){
        int output[] = new int[array.length];
        int count[] = new int[10];

        for(int i = 0; i < array.length; i++)
            count[(array[i] / exp) % 10]++;

        for(int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for(int i = array.length - 1; i >= 0; i--){
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for(int i = 0; i < array.length; i++)
            array[i] = output[i];
    }
    public static void radixing(int array[]) {
        int mix = array[0];
        for(int i = 1; i < array.length; i++)
            if(array[i] > mix)
                mix = array[i];

        for(int exp = 1; mix / exp > 0; exp *= 10)
            Radix(array, exp);
    }

    public static void main(String[] args) {
        int array[] = {319,212,6,8,100,50};
        Radix(array, array.length);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
