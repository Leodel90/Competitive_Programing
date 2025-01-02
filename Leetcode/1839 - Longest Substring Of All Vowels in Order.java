class Solution {
    public int longestBeautifulSubstring(String word) {
        char chars[] = (" "+word+"a").toCharArray();
        String vowels="aeiou";
        boolean isBeautiful=false;
        int maxLength=0;
        for(int i=1, p=0; i<chars.length; i++){
            if(chars[i-1]!=chars[i]){
                if (isBeautiful) {
                    if(chars[i-1]=='u'){
                        maxLength = Math.max(i-p, maxLength);
                        isBeautiful = false;
                    } else {
                        isBeautiful = vowels.indexOf(chars[i-1])+1 == vowels.indexOf(chars[i]);
                    }
                }
                
                if (chars[i]== 'a') {
                    isBeautiful=true;
                    p=i;
                }
            }
        }
        return maxLength;
    }
}
