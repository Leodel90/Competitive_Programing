class Solution {
    public int numOfArrays(int n, int m, int k) {
        if(k>m || k ==0)return 0;
        int mod = 1000000007;
        long combMatrix [][]=new long [m+1][k+1];
        long totalArrays=0;
        for(int i=1; i<=n; i++){
            for(int j=Math.min(k,i); j>=1; j--){
                long prevKSum = (i==1 && j==1)?1:0;
                for( int l = j; l<=m-k+j; l++){
                    prevKSum= (prevKSum+combMatrix[l-1][j-1])%mod;
                    combMatrix[l][j] = (combMatrix[l][j]*l + prevKSum)%mod;
                    
                }
            }
        }
    
        for(int j=k; j<=m; j++){
            totalArrays = (totalArrays+combMatrix[j][k])%mod;
        }
        return (int)totalArrays;
    }
}
