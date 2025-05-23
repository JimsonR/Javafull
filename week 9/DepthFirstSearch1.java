import java.util.*;

class Graph{

    Map<Integer , Set<Integer>> map = new LinkedHashMap<>();

    public void addVertex(int v){
        map.putIfAbsent(v, new LinkedHashSet<>());
    }

    public void addEdge(int vx , int vy){
        map.putIfAbsent(vx , new LinkedHashSet<>());
        map.putIfAbsent(vy, new LinkedHashSet<>());

        map.get(vx).add(vy); // As we are using Bidirectional/UnDiriectedGraph
        map.get(vy).add(vx);
    }

    public boolean removeEdge(int vx , int vy){
        if(map.get(vx)==null || map.get(vy) == null || !map.get(vx).contains(vy)){
            return false;
        }
        map.get(vx).remove(vy);
        return true;
    }

    public boolean removeVertex(int v){
        if(map.get(v) == null){
            return false;
        }
        Set<Integer> edges = map.get(v);

        for(Integer e : edges){
            removeEdge(e,v);
        }
        map.remove(v);
        return true;
    }

    public List<Integer> dfs(int source){
        Set<Integer> visitedSet = new LinkedHashSet<>();
        List<Integer> output = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        if(map.get(source) == null){
            return output;
        }

        stack.push(source);

        while(!stack.isEmpty()){
            int v = stack.pop();
            if(!visitedSet.contains(v)){
                output.add(v);
                visitedSet.add(v);
                Set<Integer> edges = map.get(v);
                for(Integer e : edges){
                    stack.push(e);
                }
            }

        }
return output;

    }

    public void print(){
        System.out.println("GRAPH :: ");
        for(Map.Entry<Integer , Set<Integer>> me : map.entrySet()){
            System.out.println(me.getKey() + " => " + me.getValue());
        }
    }
}





public class DepthFirstSearch1 {
    public static void main(String[] args) {
        int[][] edges = new int[][]{{10,15},{10,12},{10,25},{25,101},{101,12},{12,35}};

        Graph g = new Graph();

        for(int[] e : edges){
            int vx = e[0];
            int vy = e[1];
            g.addEdge(vx,vy);
        }
        g.print();
        System.out.println("DFS "+ g.dfs(10));

    }
}
