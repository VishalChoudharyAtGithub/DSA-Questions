// Problem link - https://practice.geeksforgeeks.org/problems/sorted-matrix2333/1

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int[] arr = new int[N*N];
        int index = 0;
        for(int[] subArr: Mat){
            for(int val : subArr){
                arr[index++] = val;
            }
        }
        Arrays.sort(arr);
        index = 0;
        for(int i = 0;i<N;i++)
            for(int j = 0;j<N;j++)
                Mat[i][j] = arr[index++];
                
        return Mat;
    }
}
