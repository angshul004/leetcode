class Solution {
    int soln;
    public int findKthLargest(int[] arr, int k) {
        //using concept of quick sort. cuz it finds the correct position of pivot element.
        //kth largest means item at len-k position in sorted array
        int lo=0, hi=arr.length-1;
        int neededIdx= arr.length-k;
        quickselect(arr, lo, hi, neededIdx);
        return soln;
    }
    public void quickselect(int[] arr, int lo, int hi, int neededIdx){
        if(lo>hi) return;
        // if (lo == hi) {
        //     soln = arr[lo];
        //     return;
        // }
        
        int pividx= partition(arr, lo, hi);
        if(pividx > neededIdx) quickselect(arr, lo, pividx-1, neededIdx);
        else if(pividx < neededIdx) quickselect(arr, pividx+1, hi, neededIdx);
        else{
            soln=arr[neededIdx];
        }
    }
    public int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];
        int count=0;
        for(int i=lo+1; i<=hi; i++) if(arr[i]<=pivot) count++;
        int pividx=lo+count;
        arr[lo] = arr[pividx];
        arr[pividx] = pivot;
        
        int i=lo, j=hi;
        while(i<pividx && j>pividx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        return pividx;
    }
}
