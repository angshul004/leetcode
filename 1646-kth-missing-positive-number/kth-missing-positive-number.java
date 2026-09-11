class Solution {
    public int findKthPositive(int[] arr, int k) {
        //binary search approach
        //if arr[i]=j , then upto j there are j-(i+1) missing numbers
        int lo=0, hi=arr.length-1, mid;

        while(lo<=hi){
            mid= (lo+hi)/2;

            if(arr[mid]-mid-1 < k){ //missing numbers before arr[mid] < k, so check in higher indexes
                lo=mid+1;
            }
            else{ //missing numbers before arr[mid] equal or exceed k, so check in lower indexes
                hi=mid-1;
            }
        }
        //"hi" is the index that represent the item that has items missing before it < k but, it's next item has items missing before it >= k
        /* kth missing no=
        arr[hi] + no of extra items that arent missing before arr[hi]
        = arr[hi] + k-(no of item missing before arr[hi])
        = arr[hi] + k-(arr[hi]-(hi+1))
        = k+(hi+1)
        = k+lo [∵ at the end of binary search lo becomes hi+1]
        */
        //now lo represents the count of numbers already present in the array that are strictly less than your final answer (the k-th missing number)
        return lo + k;
    }
}