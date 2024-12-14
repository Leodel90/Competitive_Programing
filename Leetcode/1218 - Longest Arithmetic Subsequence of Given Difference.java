class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
        int max=0;
        for(int i=0; i<arr.length; i++){
            int l = hash.getOrDefault(arr[i]-difference, 0) + 1;
            max = Math.max(l,max);
            hash.put(arr[i], l);
        }
        return max;
    }
}
