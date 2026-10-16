class Solution {
    public int findDuplicate(int[] nums) {
        // Create a HashSet to store the numbers we have already encountered
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If the number is already in the set, we found the duplicate
            if (seen.contains(num)) {
                return num;
            }
            // Otherwise, add the number to the set and keep moving
            seen.add(num);
        }
        
        // Return -1 if no duplicate is found (though the problem guarantees one exists)
        return -1;
    }
    

}