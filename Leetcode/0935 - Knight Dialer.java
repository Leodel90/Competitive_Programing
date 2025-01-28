class Solution {
    public int knightDialer(int n) {
        int mod=1000000007;
        int c0=1,nc0;
        int c1=1,nc1;
        int c2=1,nc2;
        int c3=1,nc3;
        int c4=1,nc4;
        int c5=1,nc5;
        int c6=1,nc6;
        int c7=1,nc7;
        int c8=1,nc8;
        int c9=1,nc9;
        for(int i=1;i<n;i++){
            nc0 = (c4+c6)%mod;
            nc1 = (c6+c8)%mod;
            nc2 = (c7+c9)%mod;
            nc3 = (c4+c8)%mod;
            nc4 = ((c3+c9)%mod+c0)%mod;
            nc5 = 0;
            nc6 = ((c0+c1)%mod+c7)%mod;
            nc7 = (c2+c6)%mod;
            nc8 = (c1+c3)%mod;
            nc9 = (c2+c4)%mod;
            c0=nc0;
            c1=nc1;
            c2=nc2;
            c3=nc3;
            c4=nc4;
            c5=nc5;
            c6=nc6;
            c7=nc7;
            c8=nc8;
            c9=nc9;
        }
        return (((((((((c0+c1)%mod+c2)%mod+c3)%mod+c4)%mod+c5)%mod+c6)%mod+c7)%mod+c8)%mod+c9)%mod;
    }
}
