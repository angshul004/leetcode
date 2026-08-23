class Solution {
    int count=0;

    public int reversePairs(int[] nums) {
        mergesort( nums);
        return count;
    }

    public void mergesort(int[] nums){
        int n=nums.length;
        if(n<=1) return;
        //divide and copy
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; i++) a[i]=nums[i];
        for(int i=0; i<n-(n/2); i++) b[i]=nums[n/2+i];

        //magic
        mergesort(a);
        mergesort(b);
        countpairs(a,b);

        //merge
        merge(a,b,nums);
        //cleanup
        a=null; b=null;
    }
    public void merge(int[] a, int[] b, int[] nums){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) nums[k++]=a[i++];
            else nums[k++]=b[j++];
        }
        while(i<a.length) nums[k++]=a[i++];
        while(j<b.length) nums[k++]=b[j++];
    }
    public void countpairs(int[] a, int[] b){
        //if 1st subarrays one element (i) is bigger than one element (j) of 2nd subarray , then, all the elements after i in 1st subarr are also bigger than j. so increse the count with that number. then check j+1 element. else, check i+1 element.
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if( (long)a[i] > 2L*(long)b[j]){
                count += a.length-i;
                j++;
            }
            else i++;
        }
    }
}