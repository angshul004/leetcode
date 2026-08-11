class Solution {
    public void moveZeroes(int[] arr) {
        //using concept of bubble sort. instead of swapping bigger element, swap zeroes to right.

        int n= arr.length;
        for(int i=0; i<n-1; i++){
            boolean sorted=true;

            for(int j=0; j<n-1-i; j++){
                if(arr[j]==0){
                    int temp= arr[j+1];
                    arr[j+1]=0;
                    arr[j]= temp;
                    sorted =false;
                }
            }

            if(sorted) break;
        }
    }
}