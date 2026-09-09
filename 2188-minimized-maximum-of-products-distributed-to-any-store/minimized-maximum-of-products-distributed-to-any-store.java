class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max= Integer.MIN_VALUE;
        for(int x: quantities){
            if(x>max) max=x;
        }
        //a shop can have minimum 1 product. And the shop can have maximum max(quantities) product. as the shop can have only 1 type pf product.
        int lo=1, hi=max, mid;
        //we have to find the 'x' in this range which is as small as possible
        int x=1;
        while(lo<=hi){
            mid= (lo+hi)/2;
            if(isStoreExceed(mid, n, quantities)){ //needs higher value of x
                lo=mid+1;
            }
            else{ //mid can be x. but also check in lower values
                x=mid;
                hi=mid-1;
            }
        }
        return x;
    }

    public boolean isStoreExceed(int mid, int n, int[] qua){
        int storeNeeded=0;
        for(int i=0; i<qua.length; i++){
            storeNeeded += (int)Math.ceil( (float)qua[i]/mid); //to get no of store needed for ith product
        }
        if(storeNeeded>n) return true;
        else return false;
    }
}