# problem - https://practice.geeksforgeeks.org/problems/number-of-coins1824/1#
# return least number of coins required for a given sum
import math
class Solution:
	def minCoins(self, coins, M, V):
		rows = M+1
		col = V+1
		dp = [[math.inf]*col]*rows
		for i in range(rows):
		    dp[i][0] = 0
		
		for i in range(1,rows):
		    for w in range(1,col):
		        if coins[i-1] > w:
		            dp[i][w] = dp[i-1][w]
		        else:
		            dp[i][w] = min(1+dp[i][w-coins[i-1]],dp[i-1][w])
	    return dp[M][V] if dp[M][V] < math.inf else -1
