class Solution {
    public int stoneGameVIII(int[] stones) {
        int[] prefix = new int[stones.length];
        prefix[0] = stones[0];
        for (int i = 1; i< stones.length; i++){
            prefix[i] = prefix [i-1] + stones[i];
        }
        int best = prefix[prefix.length - 1];
        for(int j = prefix.length - 2; j >= 1; j--){
            int back = prefix[j] - best;
            if(back > best){
                best = back;
            }
        }
        return best;
    }
}