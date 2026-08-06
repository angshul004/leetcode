class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> soln = new ArrayList<>(numRows);

        //filling up rows with 1 at start and end 
        //and in middle values, fill pper number + upper left
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i) 
                    row.add(1);
                else
                    row.add(soln.get(i-1).get(j)+soln.get(i-1).get(j-1));
            }
            soln.add(row);
        }

        return soln;
    }
}