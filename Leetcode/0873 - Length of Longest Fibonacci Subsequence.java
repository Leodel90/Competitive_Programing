class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer, Integer> exists= new HashMap<Integer, Integer>();
        int n=arr.length;
        for(int i =0;i<n; i++){
            exists.put(arr[i], i);
        }
        short longest[][]= new short [n][n]; 
        int maxLength=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int next = arr[i]+arr[j];
                if(exists.containsKey(next)){
                    int k = exists.get(next);
                    longest[j][k] = longest[i][j];
                    longest[j][k]++;
                    maxLength = Math.max(maxLength, longest[j][k]+2);
                }
            }
        }
        return maxLength;
    }
} 
