# problem - https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1#

class Solution:
    
    def lcs(self,m, n, X, Y):
        rows, col = m+1, n+1
        
        dp = [[0]*(col) for i in range(rows)]
    
        for i in range(1, rows):
            for j in range(1, col):
                if X[i-1] == Y[j-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i][j-1], dp[i-1][j])
    
        return dp[m][n]
