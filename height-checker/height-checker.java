class Solution {
    public int heightChecker(int[] heights) {
        if(heights.length == 0){
            return 0;
        }
        int expected[] = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}