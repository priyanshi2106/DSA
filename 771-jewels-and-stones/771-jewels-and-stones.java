class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        int count =0;
        for(char c: jewels.toCharArray()){
            hs.add(c);
        }
        for(char c1:stones.toCharArray()){
            if(hs.contains(c1)){
                count++;
            }
        }
        return count;
    }
}