// uses recursion

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] vis = new int[V];
        int node = 0;
        
        ArrayList<Integer> dfs_ans = new ArrayList<>();
        
        helper(node, adj, vis, dfs_ans);
        return dfs_ans;
    }
    
    private void helper(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, ArrayList<Integer> dfs_ans){
        vis[node] = 1;
        dfs_ans.add(node);
        
        for(int i : adj.get(node)){
            if(vis[i] != 1){
                helper(i, adj, vis, dfs_ans);
            }
        }
    }
}
