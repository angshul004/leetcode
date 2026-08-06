class Solution {
    public void swap(int i, int j, int[] nums){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int lo=0, mid=0, hi=nums.length-1;
        //all 0s before lo, all 1s before mid , unsorted between mid to hi,  all 2s after hi 
        //0000...11111...012110210...2222
        //       ^lo     ^mid    ^hi

        while(mid<=hi){
            if(nums[mid]==0){
                swap(mid,lo,nums);
                lo++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(mid,hi,nums);
                hi--;
            }
        }
    }
}