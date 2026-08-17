class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //implementing lower bound using binary search to find arr[lb]>=x
            int n=arr.length;
            int lo=0, hi=n-1;
            int lb=n;
            int mid;

            while(lo<=hi){
                mid=(lo+hi)/2;
                if(arr[mid]>=x){
                    hi=mid-1;
                    lb=Math.min(lb,mid);
                }
                else{
                    lo=mid+1;
                }
            }

            List<Integer> soln = new ArrayList<>();
            if(lb-1>=0 && lb<n && x-arr[lb-1] <= arr[lb]-x) lb=lb-1;
            if(lb>=n) lb=lb-1;
            soln.add(arr[lb]);
            int lefti=lb-1, righti=lb+1;
            while(soln.size()!=k){
                if(lefti>=0 && righti<n){
                    if(x-arr[lefti] <= arr[righti]-x){
                        soln.add(0,arr[lefti]);
                        lefti--;
                    }
                    else{
                        soln.add(arr[righti]);
                        righti++;
                    }
                }
                else if(righti<n){
                    soln.add(arr[righti]);
                    righti++;
                }
                else{
                    soln.add(0,arr[lefti]);
                    lefti--;
                }
            }

            return soln;

    }
}