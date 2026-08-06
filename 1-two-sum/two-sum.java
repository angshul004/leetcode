class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n=nums.length;
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    found=true;
                    break;
                }
            }
            if(found==true)
            break;
        }
        return ans;
    }
}