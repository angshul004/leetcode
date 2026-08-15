class Solution {
    public int mySqrt(int x) {
        //return (int) (Math.sqrt(x));  <-fastest way. uses newton raphson method

        //0<=sqrt(x)<=x
        //using binary search concept

        long lo=0, hi=(long)x;
        long mid;
        long sqrtint=0;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(mid*mid>x){
                hi=mid-1;
            }
            else if(mid*mid<x){
                lo=mid+1;
                sqrtint=mid;
            }
            else if(mid*mid == x){
                return (int)mid;
            }

        }
        return (int)sqrtint;
    }
}