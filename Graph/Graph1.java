import java.util.*;
import java.util.LinkedList;
public class Graph1{

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    //Undirected Graph

    //Removing null and create graph with blank arraylist

    static void createGraph(int v){
        for(int i = 0; i<v; i++){
            graph.add(new ArrayList<>());
        }

        
    }
    static void addEdge(int src, int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    static void bfs(int src, int v){
        boolean[] visited = new boolean[v];
        Queue<Integer> que = new LinkedList<>();

        que.add(src);
        visited[src] = true;
        while(!que.isEmpty()){
            int data = que.poll();
            System.out.println(data +" ");
            for(int neighbour : graph.get(data)){
                if(!visited[neighbour]){
                    que.add(neighbour);
                    visited[neighbour] = true;

                }
            }
        }
    }

    static void dfs(int src, int v){
        Deque<Integer> st = new ArrayDeque<>();

        boolean[] visited = new boolean[v];

        st.push(src);
        visited[src] = true;
        System.out.print(src + " ");

        while(!st.isEmpty()){
            
            int data = st.peek();
            for(int i : graph.get(data)){
                if(!visited[i]){
                    st.push(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
                
            }
        }


    }

    static boolean checkEdge(int src, int dest){
        return graph.get(src).contains(dest);
    }

    static void deleteEdge(int src, int dest){
        if(checkEdge(src,dest)){
        graph.get(src).remove(dest);
        graph.get(dest).remove(src);
        }
    }
    static void dfsTraverse(int src, boolean[] visited){
        visited[src] = true;
        for(int neighbour: graph.get(src)){
            if(!visited[neighbour]){
                dfsTraverse(neighbour,visited);
            }
        }
    }
    static int countConnectedComp(int v){
        boolean[] visited = new boolean[v];
        int count = 0;
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                dfsTraverse(i,visited);
                count++;
            }
        }
        return count;
    }

    static int printConnectedComp(int v){
        boolean[] visited = new boolean[v];
        int count = 0;
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                dfsTraverse(i,visited);
                count++;
            }
        }
        return count;
    }

    //Check if graph is cyclic

    static boolean dfscycle(int src, int parent, boolean[] visited){
        visited[src]= true;

        for(int i :graph.get(src)){
            if(!visited[i]){
                if(dfscycle(i, src, visited)){
                    return true;
                }
            }
            else if(i!=parent){
                return true;
            }

        }
        return true;
    }

    static boolean isCycle(int src, int v){
        boolean[] visited = new boolean[v];

        for(int i = 0; i < v; i++){
            if(!visited[i]){
                dfscycle(i,-1, visited);
                 return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        // createGraph(6);

        // addEdge(0,1);
        // addEdge(0,5);
        // addEdge(1,2);
        // addEdge(1,5);
        // addEdge(2,3);
        // addEdge(3,4);
        // addEdge(4,5);
        
        // dfs(0,6);

        // checkEdge(2,5);

        // deleteEdge(2,5);

        createGraph(6);
        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,2);
        addEdge(3,4);

        System.out.println(countConnectedComp(6));



    }
}