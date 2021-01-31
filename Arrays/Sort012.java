public class Sort012 {
    public static void sort012(int a[], int n){
        int p0=0,p1=0,p2=n-1;
        for( p1 = 0;p1<=p2;p1++){
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
