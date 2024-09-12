// 329. Longest Increasing Path in a Matrix
// Solved
// Hard
// Topics
// Companies
// Given an m x n integers matrix, return the length of the longest increasing path in matrix.

// From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).


public class longestincreasingpathinmatrix {
    
}
class solution{
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int dp [][] = new int [m][n];


    


    }public int SolveMatrix(int [][] matirx , int m , int n , int i , int j , int dp[][]){
        if(dp[i][j]!=-1){
            return dp[i][j];
             }

             if(i<0 || j<0 || i>= m || j<=n){
                return 0;
             }


             int t1 =1 ;
             int t2 =1 ;
             int t3 =1 ;
             int t4 =1 ;
             int result=0;

             //moving upwards
             if(i> 0&& matirx[i-1][j]>matirx[i][j]){
               t1= 1+ SolveMatrix(matirx, m, n, i+1, j, dp);
             } 
             //moving downwards

             if(i<m-1 && matirx[i+1][j]>matirx[i][j]){
               t2=1+ SolveMatrix(matirx , m , n , i-1 , j , dp);
             }

             //moving rightwards

             if(j<n-1 && matirx[i][j+1]> matirx[i][j]){
               t3=1+ SolveMatrix(matirx, m, n, i, j+1, dp);
             }

             if (j > 0 && matirx[i][j - 1] > matirx[i][j]) {

                t4=1+ SolveMatrix(matirx, m, n, i, j+1, dp);

             }

             result = Math.max(Math.max(t1, t2) ,Math.max(t3, t4));



    }

}
