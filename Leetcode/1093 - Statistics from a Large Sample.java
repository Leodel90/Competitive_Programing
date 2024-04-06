class Solution {
    public double[] sampleStats(int[] count) {
        double stats [] = new double [5];
        stats[0]=-1;
        int total =0;
        int mode=-1;
        for(int i=0;i<256; i++){
            if(count[i]>0){
                stats[0] = stats[0]==-1? i: stats[0];
                stats[1] = i;
                stats[2] += i*((long)count[i]);
                total += count[i];
                if(count[i]>mode){
                    mode=count[i];
                    stats[4]=i;
                }
                
            }
        }
        stats[2] = stats[2]/total;
        int m1=(total>>1) + (total&1);
        int m2=m1+1-(total&1);
        int m=-1;
        for(int i =0; i<256; i++){
            m1-=count[i];
            if (m == -1 && m1<=0) {
                m=i;
            }
            m2-=count[i];
            if (m2<=0) {
                m+=i;
                break;
            }
        }
        stats[3] = m/2.0;
        return stats;
    }
}
