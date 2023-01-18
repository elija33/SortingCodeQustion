package BucketSort;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Bucket {
    public static void BucketSoring(int array[], int countain){
        int maxElement = array[0];
        for(int i = 1; i < array.length; i++)
            maxElement = Math.max(maxElement, array[i]);
        maxElement++;
        
        Vector<Integer>[] buckets = new Vector[array.length];

        for(int i = 0; i < array.length; i++){
            buckets[i] = new Vector<>();
        }

        for(int i = 0; i < array.length; i++){
            int index = (array[i] * countain) / maxElement;
            buckets[(int)index].add(array[i]);
        }

        for(int i = 0; i < countain; i++){
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for(int i = 0; i < countain; i++){
            for(int j = 0; j < buckets[i].size(); j++){
                array[index++] = buckets[i].get(j);
            }
        }
    }
    public static void main(String[] args) {
     int array[] = {30,15,40,10,20,80,5,12,70}; 
     int countain = 4;
     BucketSoring(array, countain);  

     for(int i = 0; i < array.length; i++)
        System.out.print(array[i]+ " ");
    }
}
