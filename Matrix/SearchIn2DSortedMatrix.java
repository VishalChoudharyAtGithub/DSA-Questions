// Problem link - https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;
        
    int left = 0;
    int right = m * n - 1;
    while (right - left >= 0) {
        int middle = left + (right - left) / 2;           // Pseudoindex in an analogous list
        int middleEl = matrix[middle / n][middle % n];    // Convert to coordinates before accessing!
        if (middleEl == target)
            return true;
        if (middleEl > target)
            right = middle - 1;
        else
            left = middle + 1;
    }
    return false;
}
}
