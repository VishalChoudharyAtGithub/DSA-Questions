// Problem- https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1

class Solution{
    static int equalPartition(int n, int arr[])
    {
        int sum = Arrays.stream(arr).sum();
        if(sum % 2 != 0)
            return -1;
        sum = sum/2;
        int[][] memo = new int[n+1][sum+1];
        for(int[] row : memo)
            Arrays.fill(row,-1);
        return equalPartition(n, sum, arr,memo);
        
    }
    static int equalPartition(int n, int m, int[] arr, int[][] memo){
        if(m == 0) return 1;
        if(n == 0) return 0;
        if(memo[n][m] != -1) return memo[n][m];
        
        if(arr[n-1] <= m)
            return memo[n][m] = Integer.max(
                equalPartition(n-1,m-arr[n-1],arr,memo) ,
                equalPartition(n-1,m,arr,memo));
        return memo[n][m] = equalPartition(n-1,m,arr,memo);
    }
}
