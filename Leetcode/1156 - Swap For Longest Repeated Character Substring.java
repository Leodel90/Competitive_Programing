class Solution {
    char letters [];
    public int getNextLength(int p) {
        if(p>=letters.length) return letters.length-1;
        while (p<letters.length) {
            if (p+1 == letters.length || letters[p] != letters[p+1]) {
                break;
            } p++;
        }
        return p;
    }
    
    public int maxRepOpt1(String text) {
        letters = text.toCharArray();
        int groupFreq []= new int [26];
        for(int i=getNextLength(0); i<letters.length; i=getNextLength(i+1)){
            groupFreq[letters[i]-97] ++;
            if(i==letters.length-1) break;
        }
        int h=-1;
        int i = getNextLength(0);
        int j = getNextLength(i+1);
        int k = getNextLength(j+1);
        int maxSub = 0;
        do {
            int sum=0;
            if (letters[i] == letters[k] && i<j) {
                if (j-i==1) {
                    sum = k-j + (groupFreq[letters[i]-97]>=3?1:0);
                } else sum ++;
            } else {
                sum = groupFreq[letters[i]-97]>=2?1:0;
            }
            maxSub = Math.max(maxSub, i-h + sum);
            h=i;
            i=j;
            j=k;
            k=getNextLength(k+1);
        } while (h<i);
        return maxSub;
    }
}
