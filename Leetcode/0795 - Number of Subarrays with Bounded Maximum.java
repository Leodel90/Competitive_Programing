class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int newNums[]= new int [nums.length+2];
        System.arraycopy(nums, 0, newNums, 1, nums.length);
        nums=newNums;
        nums[0]=Integer.MAX_VALUE;
        nums[nums.length-1]=Integer.MAX_VALUE -1;
        int count = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(0);
        for (int i=1; i<nums.length; i++) {
            while(nums[i]>= nums[stack.getLast()]) {
                int j = stack.removeLast();
                if(left <= nums[j] && nums[j] <=right) {
                    count+=  (i-j)*(j-stack.getLast());
                }
            }
            stack.addLast(i);
        }
        return count;
        
    }
}
