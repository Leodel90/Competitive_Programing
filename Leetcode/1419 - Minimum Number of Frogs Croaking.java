class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        char letters[] = croakOfFrogs.toCharArray();
        int currentCount=0; 
        int minCount=0;
        String croak="croak";
        int counter[]=new int [4];
        for(int i=0;i<letters.length; i++){
            int p = croak.indexOf(letters[i]);
            if(p>0){
                if(counter[p-1]>0){
                    currentCount--;
                    counter[p-1]--;
                } else {
                    minCount=-1;
                    break;
                }
            }
            if(p<4) {
                currentCount++;
                counter[p]++;
            }
            minCount = Math.max(minCount, currentCount);
        }
        minCount = currentCount==0? minCount:-1;
        return minCount;
    }
}
