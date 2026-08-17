class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //implementing lower bound using binary search to find arr[lb]>=x
            int n=arr.length;
            int lo=0, hi=n-1;
            int lb=n;
            int mid;

        //finding the lb= the index whose value is equal or just greater than x
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
        //lb is found. now we need to find the closest values
            List<Integer> soln = new ArrayList<>();

            //if arr[lb-1] element is closer to x than arr[lb], do lb-=1
            if(lb-1>=0 && lb<n && x-arr[lb-1] <= arr[lb]-x) lb=lb-1;

            //sometimes lb can be out of array when the x doesnt exist in arr
            if(lb>=n) lb=lb-1;

            //adding arr[lb] element. then add its left and right values one by one using lefti & righti as indexes.
            soln.add(arr[lb]);
            int lefti=lb-1, righti=lb+1;
            while(soln.size()!=k){
                if(lefti>=0 && righti<n){ //when left and right index both inside arr
                    if(x-arr[lefti] <= arr[righti]-x){  //left value is closer to x or has same difference as right
                        soln.add(0,arr[lefti]); //add left element at beginning
                        lefti--;
                    }
                    else{   //right value is closer to x
                        soln.add(arr[righti]);  //add right element at end
                        righti++;
                    }
                }
                else if(righti<n){ //when left is outside of arr, but right is inside
                    soln.add(arr[righti]);
                    righti++;
                }
                else{   //when right is outside of arr, but left is inside
                    soln.add(0,arr[lefti]);
                    lefti--;
                }
            }

            return soln;

    }
}