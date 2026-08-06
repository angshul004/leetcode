class Solution {
    public int matrixScore(int[][] grid) {
        int m=grid.length, n=grid[0].length;

        //make starting bit of each row 1 by flipping them
        for(int i=0; i<m; i++){
            if(grid[i][0]==0){
                //flip the row
                for(int j=0; j<n; j++){
                    grid[i][j] = (grid[i][j] == 0) ? 1 : 0;
                }
            }
        }

        //flip col where no of 0 > no of 1
        for(int j=1; j<n; j++){
            int zeroes=0, ones=0;
            for(int i=0; i<m; i++){
                if (grid[i][j] == 0) zeroes++;
                else ones++;
            }
            if(zeroes>ones){
                //flip col
                for(int i=0; i<m; i++){
                    grid[i][j] = (grid[i][j] == 0) ? 1 : 0;
                }
            }
        }

        //count score. add all decimal value of each row.
        int ans=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    //ans= ans+ (int)Math.pow(2,(n-j-1));   (slow)
                    //For powers of 2, bit shifting does exactly the same thing, but it's faster
                    ans += 1 << (n - j - 1);        
                }
            }
        }
        return ans;

    }
}