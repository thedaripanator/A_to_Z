package Graph;

import java.util.ArrayList;

public class dfs {

    public static void dfs(ArrayList<Integer> dfs, ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis) {
        vis[node] = true;
        dfs.add(node);
        for (int it : adj.get(node)) {
            if (!vis[it]) {
                dfs(dfs, adj, it, vis);
            }
        }
    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] vis=new boolean[adj.size()];
        dfs(res,adj,1,vis);
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=8;
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);

        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);

        adj.get(4).add(3);
        adj.get(4).add(8);

        adj.get(5).add(2);

        adj.get(6).add(2);

        adj.get(7).add(3);
        adj.get(7).add(8);

        adj.get(8).add(4);
        adj.get(8).add(7);

        System.out.println(solve(adj));
    }
}
