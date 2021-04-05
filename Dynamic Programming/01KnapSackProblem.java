// Problem - https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

class Knapsack 
{ 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int [][] memo = new int[W+1][n+1];
         for(int i = 0;i<W+1;i++){
              Arrays.fill(memo[i],-1);
         }
        
         return knapSack(W,wt,val,n,memo);
    } 
    private static int knapSack(int W, int wt[],int val[],int n ,int[][] memo){
      
        if(memo[W][n] != -1) return memo[W][n];
        if( n==0 || W == 0) return 0;
        int max =-1;
        if(wt[n-1] > W) max =  knapSack(W,wt,val,n-1,memo);
        else
            max = Integer.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1,memo)
                             ,knapSack(W,wt,val,n-1,memo));
       
        memo[W][n]= max;
        return max;
    }
}
