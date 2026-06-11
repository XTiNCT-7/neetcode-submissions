class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int index = 0;
        int s=0; 
        int e=nums.length-1;
        
        while(s<=e){
            if(nums[s] == val){
                if( nums[e] != val){
                    int i = nums[s];
                    nums[s] = nums[e];
                    nums[e] = i;
                    s++;
                    result++;
                }
                e--;
            } else{
                result++;
                s++;
            }

        }
        return result;
        
    }
}