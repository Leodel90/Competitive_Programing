class Solution {
    public int minIncrementForUnique(int[] nums) {
        BitSet indexes = new BitSet();
        int frequency [] = new int [40001];
        for(int i =0; i<nums.length; i++){
            frequency[nums[i]]++;
            indexes.set(nums[i]);
        }
        int moves = 0;
        for(int i = indexes.nextSetBit(0),j; i>=0; i=j){
            j = indexes.nextSetBit(i+1);
            int k = j>=0?j:Integer.MAX_VALUE;
            int dist = Math.min(frequency[i]-1, k-i-1);
            moves += ((dist*dist + dist)>>1) + (frequency[i]-dist-1)*(k-i);
            if(j>=0) {frequency[k]+=frequency[i]-dist-1;}
            
        }
        return moves;
    }
}
