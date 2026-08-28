package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        boolean [] vis=new boolean[adj.size()];
        ArrayList<Integer> bfs=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();

        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            vis[node]=true;
            for(int it:adj.get(node)){
                if(!vis[it]){
                    q.add(it);
                    vis[it]=true;
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=9;
        for(int i=0;i<9;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(5);

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(0);

        adj.get(2).add(1);

        adj.get(3).add(1);
        adj.get(3).add(4);

        adj.get(4).add(3);
        adj.get(4).add(7);

        adj.get(5).add(0);
        adj.get(5).add(6);
        adj.get(5).add(8);

        adj.get(6).add(5);
        adj.get(6).add(7);

        adj.get(7).add(4);
        adj.get(7).add(6);

        adj.get(8).add(5);


        System.out.println(bfs(adj));
    }
}
