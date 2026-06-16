class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int maxValue = -1;
        for (int i = 0; i < arr.length; i++) {
            maxValue = -1;
            for (int j = i + 1; j < arr.length; j++) { 
                maxValue = Math.max(maxValue, arr[j]);
                res[i] = maxValue;

            }
            if( i == arr.length-1){
                res[i] = -1;
            }
        }
        return res;
    }
}