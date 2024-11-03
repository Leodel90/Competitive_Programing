class Solution {
    int disjointSets[];
    public void union(int a, int b){
        if(find(a) != find(b)){
            disjointSets[find(b)]=a;
        }
    }
    public int find(int a){
        List<Integer> sets= new LinkedList<Integer>();
        while (a!=disjointSets[a]) {
            sets.add(a);
            a=disjointSets[a];
        }
        for (Integer el: sets) {
            disjointSets[el] = a;
        }
        return a;
    }
    public boolean equationsPossible(String[] equations) {
        disjointSets = new int [26];
        for (int i=0;i<26; i++) {
            disjointSets[i]=i;
        }
        for (int i=0;i<equations.length; i++) {
            if (equations[i].charAt(1) == '=') {
                union(equations[i].charAt(0)-97, equations[i].charAt(3)-97);
            }
        }
        boolean isPossible=true;
        for (int i=0;i<equations.length && isPossible; i++) {
            if (equations[i].charAt(1) == '!') {
                isPossible = find(equations[i].charAt(0)-97) != find(equations[i].charAt(3)-97);
            }
        }
        return isPossible;
    }
}
