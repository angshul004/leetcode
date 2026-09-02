class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //using binary search concept
        // to find the capacity, highest ship capacity can be sum of all weights. 
        //lowest ship capacity can be maximum weight. 
        //we have to search in this range to find optimal capacity.
        int sum=0, max=Integer.MIN_VALUE;
        for(int x : weights){
            sum+=x;
            if(x>max) max=x;
        }

        int lo=max, hi=sum, mid;
        int soln=0;
        while(lo<=hi){
            mid=(lo+hi)/2;
            int calculatedDays = calculateDays(mid, weights);//calculating days needed to ship with 'mid' capacity
            
            if(days >= calculatedDays){ //mid capacity is ok to ship. but still check in lower capacity to utilize all days
                soln=mid;
                hi=mid-1;
            }
            else if(days < calculatedDays){ // exceeding the required days. increase capacity.
                lo=mid+1;
            }
        }
        return soln;
    }
    public int calculateDays(int capacity, int[] weights){
        int day=1, currWeigh=0;
        for(int i=0; i<weights.length; i++){
            if(currWeigh+weights[i] <= capacity){
                currWeigh+= weights[i];
            }
            else{
                day++;
                currWeigh=0;
                currWeigh+= weights[i];
            }
        }
        return day;
    }
}