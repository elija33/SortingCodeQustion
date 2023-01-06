# SortingCodeQustion

                                                        Selection Sort
Loop thought the array, and pick the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list. 

The first element is 20, which is the first index also the biggest element in the array.
Look for the  smallest element in the array
            20, 12, 10, 15, 2  
             ^              ^

Swap the biggest element and the smallest element 
                20, 12, 10, 15, 2   ==>    2, 12, 10, 15, 20
                 ^              ^
                     swapping 

Now the smallest element will become the first element index.
            2, 12, 10, 15, 20 

Do the same over and over
             2, 12, 10, 15, 20  ==>     2, 10, 12, 15, 20 
                 ^   ^
                 swap
                          
Now the list is sorted.
