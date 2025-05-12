package AdjacencyMatrix;

import java.util.ArrayList;

public class Graph {
// we are going to declare a 2D array of integers
    ArrayList<Node> nodes ;


    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix= new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src, int dest){         // src is row and dest is column
        matrix[src][dest] = 1;
    }
    public boolean checkEdge(int src, int dest){
        if(matrix[src][dest] == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(){
        System.out.print("  ");
        for(Node node: nodes){

            System.out.print(node.data+" ");
        }
        System.out.println();
        for(int i = 0 ; i < matrix.length ; i++){
//            int c = 65;
//            if(i==0){
//                for (int j = 0; j < matrix.length; j++) {
//                    if(j==0) System.out.print("  ");
//
//                    System.out.print((char) c++ +" ");
//                }
//            }

            System.out.print(nodes.get(i).data+" ");
            for (int j = 0 ; j < matrix.length ; j++){
//                if(j==0){
//                    System.out.print((char)d++);
//                }

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }

}
