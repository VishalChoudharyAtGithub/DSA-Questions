[GFG Question link](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1)

public class Sort012 {
    public static void sort012(int a[], int n){
        // [1,0,0,2,1,2,0]
        // Idea is to keep 3 pointers - 1 for '0', 1 for '1' and last for '2'.
        // set p0,p1 to 0th index and p2 to last index.
        // Now start traversing.
        int p0=0,p1=0,p2=n-1;
        for( p1 = 0; p1<=p2 ; p1++){
            if(a[p1]==0){
                swap(p0,p1,a);
                p0++;
                continue;
            }
            if(a[p1]==2){
                swap(p1,p2,a);
                    p2--;
                    p1--;  
            }        
        }
    }
    private static final void swap(int firstIndex,int secondIndex,int[] arr){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}

/// Main algo 
// Purpose of p1 is to traverse the array.

// purpose of p0 is points to first 1, so that when in future '0' encounters, we can swap them
// [0,0,1,1,1,0,2]
//      p0    p1
// like here p1 finds a '0' so we can easily swap with p0 and then increment both.
// [0,0,0,1,1,1,2]  <- like this.
//        p0    p1
// purpose of p2 is to points to the first occurance of '2' - 1 so whenever we met '2' , we can easily swap.
// [0,0,1,2,0,2,0,1,2,2]
//        p1      p2
// in this eg: p1 mets '2' so we can swap with p2 and DECREMENT p2  * BUT NOT INCREMENT p1
// Reason to not increment p1 is that we don't know whether p2 was pointing to '1' or '0'.
// so if it was '0' then we need to swap it too with p0.
