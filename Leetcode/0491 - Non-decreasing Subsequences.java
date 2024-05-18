class Solution {
    List<List<Integer>> subsequences;
    int nums[];
    LinkedList<Integer> stack;
    public void dfs(int index, int prev){
        HashSet<Integer> repeated = new HashSet();
        if(stack.size()>=2){
            subsequences.add(new LinkedList<Integer>(stack));
        }
        for(int i=index+1;i<nums.length; i++){
            if (nums[i] >= prev && !repeated.contains(nums[i])) {
                repeated.add(nums[i]);
                stack.addLast(nums[i]);
                dfs(i, nums[i]);
                stack.removeLast();
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        stack = new LinkedList<Integer>();
        subsequences = new LinkedList<List<Integer>>();
        this.nums = nums;
        dfs(-1, -101);
        return subsequences;
    }
}
