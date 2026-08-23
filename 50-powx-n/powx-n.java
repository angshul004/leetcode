class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if(N<0) return 1.0/pow(x, -N);
        else return pow(x, N);

    }
    public double pow(double x, long n){

        if(n==0) return 1.0;


        double ans = pow(x,n/2);        //this makes TC O(logn)
        if(n%2==0) return ans*ans;
        else return ans*ans*x;      //every power will hit this line when power becomes 1
    }
}