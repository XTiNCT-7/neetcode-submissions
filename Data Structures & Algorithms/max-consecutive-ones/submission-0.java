class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int start = 0;
        int end = nums.length -1;
        int count = 0;

        if(nums.length == 1){
            if(nums[0]==1) return 1;
            else return 0;
        }
        while(start <= end){
            if(nums[start] == 1){
                count += 1;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
            start++;
        }
        return Math.max(result, count);
    }
}