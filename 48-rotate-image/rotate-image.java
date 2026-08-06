class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int row = matrix.length;
        int col = matrix[0].length;

        // step 1 transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // step 2 reverse each row
        for (int i = 0; i < row; i++) {
            for(int j=0; j<col/2; j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][col-j-1];
                matrix[i][col-j-1]=temp;
            }
        }
    }
}