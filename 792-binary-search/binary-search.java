class Solution {
    public int search(int[] arr, int key) {
        int lo=0, hi=arr.length-1;
        int mid;

        while(lo<=hi){
            mid=(lo+hi)/2;
            if(key < arr[mid]) hi=mid-1;
            else if(key > arr[mid]) lo=mid+1;
            else return mid;
        }
        return -1;
    }
}