package MeetingMaximumGuests;

import java.util.Arrays;

public class MaximumGuests {
    public static int maxGuests(int arrival[], int departure[]){
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 1, j = 0, result = 1, curr = 1;
        while(i < arrival.length && result < departure.length){
            if(arrival[i] < departure[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            result = Math.max(result, curr);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        System.out.println(maxGuests(arr, dep));
    }
}
