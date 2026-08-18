class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //here taking the ceiling of the division (rounding up to the nearest integer greater than or equal to the result) eg. 5/4= ⌈1.25⌉ = 2
        //implemeting concept of binary search. dividing by greater numbers makes the sum lesser.
        //if sum of division of values > threshold then, that isnt solution, we have to check in larger numbers. else, that can be possible soln and check in smaller numbers further.

        //find max element . because the largest ans can be max value. 
        int max=Integer.MIN_VALUE;
        for(int x: nums){
            if(x>max) max=x;
        }

        int n=nums.length;
        int lo=1, hi=max, mid; //we have to find the ans between 1 to max 
        int ans=1;

        while(lo<=hi){
            mid=(lo+hi)/2;

            int sum=0, division;
            for(int i=0; i<n; i++){
                division=(nums[i] + mid -1) / mid; //ceiling division
                sum+=division;
            }

            if(sum>threshold){ 
                lo=mid+1; //we need to divide by bigger number
            }
            else if(sum<=threshold){
                hi=mid-1; //mid can be possible ans, but check also using smaller no
                ans=mid;
            }

        }
        return ans;
    }
}