class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> soln = new ArrayList<>();
        
        int minr= 0, maxr= matrix.length-1;
        int minc= 0, maxc= matrix[0].length-1;

        while(minc<=maxc && minr<=maxr){
            // left to right ---->
            for(int j=minc; j<=maxc; j++){
                soln.add(matrix[minr][j]);      //row constant
            }
            minr++;

            //top to bottom ↓
            if(minr>maxr || minc>maxc) break;
            for(int i=minr; i<=maxr; i++){
                soln.add(matrix[i][maxc]);      //col constant
            }
            maxc--;

            //right to left <---
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc; j>=minc; j--){
                soln.add(matrix[maxr][j]);     //row const
            }
            maxr--;

            //bottom to top ↑
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr; i>=minr; i--){
                soln.add(matrix[i][minc]);      //col const
            }
            minc++;
        }
        return soln;
    }
}