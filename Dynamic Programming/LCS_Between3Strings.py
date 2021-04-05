# problem - https://practice.geeksforgeeks.org/problems/lcs-of-three-strings0028/1#

class Solution:
    def LCSof3(self,A,B,C,n1,n2,n3):
        x,y,z = n1+1,n2+1,n3+1
        dp = [[[0]*z for i in range(y)] for j in range(x)]
        for i in range(1,x):
            for j in range(1,y):
                for k in range(1,z):
                    if A[i-1] == B[j-1] == C[k-1]:
                        dp[i][j][k] = 1+dp[i-1][j-1][k-1]
                    else:
                        dp[i][j][k] = max(dp[i-1][j][k],dp[i][j-1][k],dp[i][j][k-1])
        return dp[n1][n2][n3]
