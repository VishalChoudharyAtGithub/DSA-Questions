// Problem link - https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        
        int rn = -1;
        int index = m;
        for(int i = 0;i<m;i++){
            if(arr[0][i]==1){
                index = i;
                break;
            }
        }
        if(index == 0) return 0;
        for(int i = 1;i<n;i++){
            if(arr[i][index-1]==1){
                while(index>0 && arr[i][index-1]==1){
                    index--;
                }
                if(index == 0) return i;
                rn = Math.max(rn,i);
            }
        }
        
        return rn;
    }
}
