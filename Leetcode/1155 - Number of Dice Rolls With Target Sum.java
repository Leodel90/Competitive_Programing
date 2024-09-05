class Solution {
    int dp[][];
    int f;
    int mod = 1000000007;
    public int topDown(int d, int target){
        if(target<d || target>d*f)return 0;
        if(dp[target][d]>0) return dp[target][d];
        for(int i=1; i<=f; i++){
            dp[target][d]=(dp[target][d]+topDown(d-1, target-i)) % mod;
        }
        return dp[target][d];
    }
    public int numRollsToTarget(int d, int f, int target) {
        dp = new int [target+1][d+1];
        this.f=f;
        for(int i=1;i<=Math.min(f,target);i++){dp[i][1]=1;}
        return topDown(d,target);
    }
}
