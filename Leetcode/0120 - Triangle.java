class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        LinkedList<List<Integer>> stack = new LinkedList<List<Integer>> (triangle);
        triangle=null;
        List<Integer> queue = stack.removeLast();
        while(!stack.isEmpty()){
            List<Integer> row = stack.removeLast();
            int l = queue.remove(0);
            List<Integer> newQ  = new LinkedList();
            for(Integer i: row){
                int r= queue.remove(0);
                newQ.add(Math.min(r,l)+i);
                l=r;
            }
            queue = newQ;
        }
        return queue.remove(0);
    }
}
