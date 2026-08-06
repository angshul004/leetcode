class Solution {
    public void setZeroes(int[][] matrix) {
        //best method: First, traverse only 0th row and 0th col to find if 0 is there and use 2 boolean variables to mark row and col if theyre needed to make all0 later. Then use 0th row and 0th col as extra array space. Traverse the whole matrix except 0th row and 0th col, Mark the rows and columns that are needed to make 0 by inserting '0' at 0th row and col positions. Then edit the matrix except 0th row and col based on the markers. at the end check bool variables and make 0th row and 0th col all0 if needed.

        int m=matrix.length, n=matrix[0].length;
        boolean zeroRow= false, zeroCol= false;

        //check 0th row
        for(int j=0; j<n; j++){
            if(matrix[0][j]==0){
                zeroRow=true;
                break;
            }
        }
        //check 0th col
        for(int i=0; i<m; i++){
            if(matrix[i][0]==0){ 
                zeroCol=true;
                break;
            }
        }

        //traverse matrix except 0th row & col and mark
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=matrix[i][0]=0;
                }
            }
        }

        //traverse 0th col (except 0,0) and set rows to all0
        for(int i=1; i<m; i++){
            if(matrix[i][0]==0){
                for(int j=1; j<n; j++)
                    matrix[i][j]=0;
            }
        }
        //traverse 0th row (except 0,0) and set cols to all0
        for(int j=1; j<n; j++){
            if(matrix[0][j]==0){
                for(int i=1; i<m; i++)
                    matrix[i][j]=0;
            }
        }

        //make 0th row and col 0. if needed
        if(zeroRow)
            for(int j=0; j<n; j++)
                matrix[0][j]=0;
        if(zeroCol)
            for(int i=0; i<m; i++)
                matrix[i][0]=0;

    }
}