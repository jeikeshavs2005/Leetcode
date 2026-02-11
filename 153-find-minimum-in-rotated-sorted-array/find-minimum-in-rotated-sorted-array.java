class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int high = nums.length-1;
        while(lo<high){
            int mid =  lo+(high-lo)/2;
            if(nums[mid]>nums[high]){
                lo = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[lo];
    }
}