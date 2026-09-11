class Solution {
    public int fibdp(int n, int[] arr){
        if(n<=1) return n;  //base case
        if(arr[n]!=0) return arr[n];

        int ans= fibdp(n-1, arr)+fibdp(n-2, arr);
        arr[n]=ans;
        return ans;
    }
    public int fib(int n) {
        /* bottom up / tabulation approach (without array - space optimized):
        if(n<=1) return n;
        int n0=0, n1=1;
        int sum=0;
        for(int i=0; i<n-1; i++){
            sum=n0+n1;
            n0=n1;
            n1=sum;
        }
        return sum;
        */

        // dynamic programming: (top down / memoization approach)
        int[] arr = new int[n+1];    //need index values 0 to n
        return fibdp(n, arr);
    }
}