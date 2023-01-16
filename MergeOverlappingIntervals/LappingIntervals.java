package MergeOverlappingIntervals;

import java.lang.reflect.Array;
import java.util.Arrays;

class Interval implements Comparable<Interval> {
    int count;
    int totalcount;

    public Interval(int count, int totalcount){
        this.count = count;
        this.totalcount = totalcount;
    }

    public int compareTo(Interval a) {
        return this.count - a.count;
    }
};

class LappingIntervals{
    public static void mergeIntervals(Interval array[]){
        Arrays.sort(array);
        int resut = 0;

        for(int i = 1; i < array.length; i++){
            if(array[resut].totalcount >= array[i].count){
                array[resut].totalcount = Math.max(array[resut].totalcount, array[i].totalcount);
                array[resut].count = Math.min(array[resut].count, array[i].count);
            }
            else{
                resut++;
                array[resut] = array[i];
            }
        }
        for(int i = 0; i <= resut; i++){
            System.out.println("[" + array[i].count + ", " + array[i].totalcount + "]");
        }
    }
    public static void main(String[] args) {
        Interval array[] = {new Interval(5, 10), new Interval(3, 15), new Interval(18, 30), new Interval(2, 7)};
        mergeIntervals(array);
    }
}
