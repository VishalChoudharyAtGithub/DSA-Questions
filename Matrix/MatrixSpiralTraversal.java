// Problem link - https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

class MatrixSpiralTraversal{

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0,bottom = r-1,left = 0,right = c-1,d = 0;
        while(top <= bottom && left <= right){
            if(d == 0){
                for(int i = left;i<=right;i++){
                    res.add(matrix[top][i]);
                }
                top++;
            }
            else if(d == 1){
                for(int i = top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            else if(d == 2){
                for(int i = right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(d == 3){
                for(int i = bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            d=(d+1)%4;
        }
        return res;
    }
}
