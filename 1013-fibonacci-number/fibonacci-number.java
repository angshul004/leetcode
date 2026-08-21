class Solution {
    static int[] arr;
    public int fibdp(int n){
        if(n<=1) return n;  //base case
        if(arr[n]!=0) return arr[n];

        int ans= fibdp(n-1)+fibdp(n-2);
        arr[n]=ans;
        return ans;
    }
    public int fib(int n) {
        /* normal way:
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

        // dynamic programming:
        arr = new int[n+1];    //need index values 0 to n
        return fibdp(n);
    }
}