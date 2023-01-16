package CycleSort;

public class Cycle {
    public static void CycleSort(int array[]){
        for(int cs = 0; cs < array.length-1; cs++){
            int item = array[cs];
            int post = cs;
            for(int i = cs + 1; i < array.length; i++){
                if(array[i] < item)
                    post++;
            }
            // swaping the elements 
            int temp = item;
            item = array[post];
            array[post] = temp;
            while(post != cs){
                post = cs;
                for(int i = cs + 1; i < array.length; i++){
                    if(array[i] < item)
                        post++;
                }
                temp = item;
                item = array[post];
                array[post] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int array[] = { 20,40,50,10,30 }; 
        CycleSort(array);
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]+ " ");
        }  
    }
}
