package Ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }


    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
        matrix[dst][src] = 1;
    }


    public boolean checkEdge(int src, int dst){
        return matrix[src][dst] == 1;
    }

    public void print(){
        System.out.print(" ");
        for(Node node: nodes){
            System.out.print("              " + Arrays.toString(node.name.split("\\d{3}")) + " ");
        }
            System.out.println();
        for(int i = 0; i < matrix.length; i++){
            System.out.print(Arrays.toString(nodes.get(i).name.split("\\d{3}")).substring(0, 5) + "]");
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("              " + matrix[i][j] + "             ");
            }
            System.out.println();
        }
    }

}
