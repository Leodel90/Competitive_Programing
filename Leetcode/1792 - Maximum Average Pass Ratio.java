class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int []> pq = new PriorityQueue<int[]> (
            (a,b) -> (a[0]+1)/(a[1] +1.0)- a[0]/(double)a[1] > (b[0]+1.0)/(b[1]+1.0) - b[0]/(double)b[1]?-1:1
        );
        for(int i =0; i<classes.length; i++) {
            pq.add(classes[i]);
        }

        for (int i=0; i<extraStudents; i++) {
            int c []= pq.poll();
            c[0]++;
            c[1]++;
            pq.add(c);
        }
        double prom = 0;
        for(int c[]: pq){
            prom +=  (c[0]/(double)c[1]);
        }
        return prom/classes.length;
    }
}
