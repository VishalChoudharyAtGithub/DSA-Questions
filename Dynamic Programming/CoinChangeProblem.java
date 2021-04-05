// Problem - https://practice.geeksforgeeks.org/problems/coin-change2448/1

class Solution
{
    
    public long count(int S[], int m, int n) 
    { 
        long[][] memo = new long[m+1][n+1];
        for(long[] row : memo)
            Arrays.fill(row,-1);
        
        return count(S ,m ,n , memo);
    }
    public long count(int S[], int m, int n, long[][] memo){
        if (n<=0) return 1;
        if (m<=0) return 0;
        
        if (memo[m][n] != -1)
            return memo[m][n];
        
        if (n<S[m-1])
            return memo[m][n] =  count(S,m-1,n,memo);
        else
            return memo[m][n] = count(S,m-1,n,memo) + count(S,m,n-S[m-1],memo);
        
        
    }
    
    
}
