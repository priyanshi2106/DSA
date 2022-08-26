class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int ans = -1;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                ans = mid;
            }
           if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return ans;
    }
}