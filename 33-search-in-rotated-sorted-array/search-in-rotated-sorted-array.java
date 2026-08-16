class Solution {
    public int search(int[] nums, int target) {
        //using binary search concept.
        //compare the mid with last element to know if we are in left sorted part or right sorted part (or left/right of highest element).
        int n=nums.length;
        int lo=0, hi=n-1;
        int mid;
        boolean targetInLeft = target>nums[n-1]; //true means the target is in left subarray

        while(lo<=hi){
            mid=(hi+lo)/2;
            if(nums[mid]==target) return mid;

            boolean midInLeft = nums[mid] > nums[n-1]; //true if we are in left subarr
            if(midInLeft == targetInLeft){ // Both target and mid are in same subarr
                if(nums[mid]>target){   //normal binary search
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
            else if(targetInLeft){// Target is in left, mid is in right -> go left
                hi=mid-1;
            }
            else{// Target is in right, mid is in left -> go right
                lo=mid+1;
            }

            
        }
        return -1;
    }
}