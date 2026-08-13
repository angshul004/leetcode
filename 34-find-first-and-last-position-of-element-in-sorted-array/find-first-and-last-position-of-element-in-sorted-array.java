class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] soln= {-1,-1};

        //finding lower bound - it will find the first occurance
        int lo=0, hi=nums.length-1, mid;
        int lb= nums.length;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(nums[mid]>=target){
                hi=mid-1;
                if(mid<lb) lb=mid;
            }else{
                lo=mid+1;
            }
        }
        //finding upper bound - it will find the next element after last occurance
        lo=0; hi=nums.length-1;
        int ub= nums.length;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(nums[mid]>target){
                hi=mid-1;
                if(mid<ub) ub=mid;
            }else{
                lo=mid+1;
            }
        }

        if(lb<nums.length && nums[lb]==target){
            soln[0]=lb;
            soln[1]=ub-1;
        }
        
        return soln;
    }
}