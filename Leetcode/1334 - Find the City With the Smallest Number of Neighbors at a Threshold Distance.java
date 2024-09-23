class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<Pair<Integer, Integer>> E[]= new LinkedList[n];
        for(int i=0;i<n;i++){
            E[i] = new LinkedList<Pair<Integer,Integer>>();
        }
        for (int i=0; i<edges.length; i++) {
            E[edges[i][0]].add(new Pair(edges[i][1], edges[i][2]));
            E[edges[i][1]].add(new Pair(edges[i][0], edges[i][2]));
        }
        int BF [][] =new int [n][n];
        int city=0;
        int minCount=Integer.MAX_VALUE;
        for (int i = 0; i<n; i++) {
            PriorityQueue<Pair<Integer, Integer>> pq = 
                new PriorityQueue<Pair<Integer,Integer>> (
                    (a,b) -> a.getKey() - b.getKey()
                );
            pq.add(new Pair(0, i));
            int count=0;
            while(!pq.isEmpty()) {
                Pair<Integer, Integer> pair = pq.poll();
                int node = pair.getValue();
                if (pair.getKey() == BF[i][node]) {
                    for(Pair<Integer,Integer> edge: E[node]) {
                        int newWeight = BF[i][node] + edge.getValue();
                        int newNode = edge.getKey();
                        if ((newNode != i && BF[i][newNode]== 0 )|| newWeight<BF[i][newNode]) {
                            BF[i][newNode]=newWeight;
                            pq.add(new Pair(newWeight, newNode ));
                        }
                    }
                }
            }
            for (int j=0; j<n; j++) {
                if(0<BF[i][j] && BF[i][j]<= distanceThreshold){
                    count++;
                }
            }
            if (count<=minCount) {
                minCount=count;
                city=i;
            }   
        }
        return city;
    }
}
