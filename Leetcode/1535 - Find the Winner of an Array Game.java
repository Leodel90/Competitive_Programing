class Solution {
    public int getWinner(int[] arr, int k) {
        int j=0;
        int c=0;
        for (int i=1;i<arr.length; i++) {
            if(arr[j]<arr[i]){
                c=0;
                j=i;
            }
            c++;
            if (c==k) {
                break;
            }
        }
        return arr[j];
    }
}
