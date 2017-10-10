package leetcode;

public class OJ081_SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target){
        if(nums.length == 0) return false;
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] == target) return true;
            if(nums[mid] > nums[end]){
                if(nums[mid] > target && nums[start] <= target) end = mid;
                else start = mid + 1;
            }else if(nums[mid] < nums[end]){
                if(nums[mid] < target && nums[end] >= target) start = mid + 1;
                else end = mid;
            }else
                end--;
        }
        return nums[start] == target ? true : false;
    }
}
