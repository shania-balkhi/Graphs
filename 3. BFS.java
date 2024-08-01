// uses queue

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] vis = new int[V];
        vis[0] = 1;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        
        ArrayList<Integer> bfs_ans = new ArrayList<>();
        while( !(q.isEmpty()) ){
            int node = q.remove();
            bfs_ans.add(node);
            
            for(int i : adj.get(node)){
                if(vis[i] != 1){
                    q.add(i);
                    vis[i] = 1;
                }
            }
        }
        
        return bfs_ans;
        
    }
}
