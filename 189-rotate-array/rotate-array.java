class Solution {
    public void rev(int[] nums, int i, int j){
        int mid=(i+j+1)/2;
        for(int x=i; x<mid; x++){
            int temp=nums[x];
            nums[x]=nums[j];
            nums[j]=temp;
            j--;
        }

    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums, 0,n-k-1);
        rev(nums, n-k,n-1);
        rev(nums, 0, n-1);
    }
}