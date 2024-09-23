class Solution {
    int nums[];
    int DP [][];
    int hashIndex [];
    public int complete(int n, int c) {
        if (DP[n][c]>0) {
            return DP[n][c]-1;
        }
        DP[n][c] = 1;
        if(n<nums[0]*c || n>nums[nums.length-1]*c ) {return DP[n][c]-1;}
        for(int i = hashIndex[n]; i>=0; i--){
            DP[n][c]+=complete(n-nums[i], c-1);
        }
        return DP[n][c]-1;
    }
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        this.nums=nums;
        DP = new int[target+1][target+1];
        hashIndex = new int[target+1];
        for (int i=0,p=0;i<=target; i++) {
            if(p< nums.length && nums[p]<=i){
                p++;
            }
            hashIndex[i] = p-1;
            DP[i][0]=1;
            DP[0][i]+=1;
        }
        int sum = 0;
        for(int i=1;i<=target; i++){
            sum+=complete(target, i);
        }
        return sum;
    }
}
