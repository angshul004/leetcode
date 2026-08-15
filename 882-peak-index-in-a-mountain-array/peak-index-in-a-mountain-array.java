class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        //using binary search concept
        int n= nums.length;
        int lo=1, hi=n-2;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;

            if(nums[mid-1]<nums[mid] && nums[mid]<nums[mid+1]){
                lo=mid+1;
            }
            else if(nums[mid-1]>nums[mid] && nums[mid]>nums[mid+1]){
                hi=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}