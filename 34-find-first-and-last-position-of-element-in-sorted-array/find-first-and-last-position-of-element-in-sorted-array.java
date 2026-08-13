class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] soln= {-1,-1};

        //finding lower bound - it will find the first occurance
        //lb means the element which is equal or just bigger than target
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
        //ub means the element which is just bigger than target
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

        //this check is importent before setting soln values. cuz lb points to index=length when target isnt present & all elements are less than target. And also, when target isnt present it points to number just bigger than the target. in those cases we must not update soln values and keep -1,-1. this condition also makes sure isnt wrong. cuz if lb is valid and points to target, ub is guaranteed to be correct.
        if(lb<nums.length && nums[lb]==target){
            soln[0]=lb;
            soln[1]=ub-1;
        }
        
        return soln;
    }
}