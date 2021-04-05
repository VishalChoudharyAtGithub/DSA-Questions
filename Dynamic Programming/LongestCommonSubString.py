# problem - https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1

class Solution:
    def longestCommonSubstr(self, S1, S2, n, m):
        res = 0
        rows,col = n+1,m+1
        dp = [[0]*col for i in range(rows)]
        
        for i in range(1,rows):
            for j in range(1,col):
                if S1[i-1] == S2[j-1]:
                    dp[i][j] = dp[i-1][j-1]+1
                    res = max(res,dp[i][j])
                else:
                    dp[i][j] = 0
        return(res)
