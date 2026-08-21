class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int n0=0, n1=1;
        int sum=0;
        for(int i=0; i<n-1; i++){
            sum=n0+n1;
            n0=n1;
            n1=sum;
        }
        return sum;
    }
}