class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length; //no. of rows
        int c = matrix[0].length; //no. of columns

        int [][] result = new int[c][r];
        for(int i = 0; i<r; i++){
            for(int j = 0; j < c; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}