class Solution {
    int R[] = {-1,0,1,0};
    int C[] = {0,1,0,-1};
    public List getAdjacentOrangeType(int i, int j, int type, int [][]grid){
        List<Pair<Integer,Integer>> queue = new LinkedList<Pair<Integer,Integer>>();
        for(int k =0;k<4; k++){
            int ni =i+R[k];
            int nj =j+C[k];
            if (0<=ni && ni<grid.length && 0<=nj && nj<grid[0].length && grid[ni][nj] == type) {
                queue.add(new Pair (ni,nj));
            }
        }
        return queue;
    }
    
    public int orangesRotting(int[][] grid) {
        int oranges = 0;
        List<Pair<Integer,Integer>> queue = new LinkedList<Pair<Integer,Integer>>();
        for (int i = 0; i<grid.length; i++) {
            for (int j =0; j<grid[0].length; j++) {
                if(grid[i][j] == 1){
                    oranges++;
                    if( !getAdjacentOrangeType(i,j,2,grid).isEmpty() ){
                        queue.add(new Pair(i,j));
                    }
                }
            }
        }
        int minutes = 0;
        
        while (!queue.isEmpty()) {
            minutes++;
            for (Pair<Integer, Integer> orange: queue) {
                if(grid[orange.getKey()][orange.getValue()] == 1) {
                    grid[orange.getKey()][orange.getValue()] = 2;
                    oranges--;
                }
            }
            List<Pair<Integer,Integer>> nextQueue = new LinkedList<Pair<Integer,Integer>>();
            for (Pair<Integer, Integer> rottenOrange: queue) {
                nextQueue.addAll(getAdjacentOrangeType(rottenOrange.getKey(),rottenOrange.getValue(),1, grid));
            }
            queue = nextQueue;
        }
        return oranges == 0? minutes:-1;
    }
}
