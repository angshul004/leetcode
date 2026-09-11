class Solution {
    public int findKthPositive(int[] arr, int k) {
        //binary search approach
        //if arr[i]=j , then upto j there are j-(i+1) missing numbers
        int lo=0, hi=arr.length-1, mid;
        int ansIndex=0;
        while(lo<=hi){
            mid= (lo+hi)/2;

            if(arr[mid]-mid-1 < k){     //missing numbers before arr[mid] < k
                lo=mid+1;
                ansIndex=mid;
            }
            else{
                hi=mid-1;
            }
        }
        // 'lo' represents how many elements exist before our k-th missing number
        return lo + k;
    }
}