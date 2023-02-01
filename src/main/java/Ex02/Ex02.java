package Ex02;


import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public List<String> shortestPath(String start, String end){
        List<String> list = new ArrayList<>();

        // BFS code goes in here
        // Add to list
        // if both paths are shortest, return one of them

        return list;
    }


    public List<String> allPaths(String start, String end){
        List<String> list = new ArrayList<>();

        // DFS code goes in here
        // Add to list

        return list;
    }


    public static void main(String[] args){
        Graph graph = new Graph(5);
        ArrayList<String> hDestinations = new ArrayList<>();
        hDestinations.add("Holmenkollen Ski Jump");
        hDestinations.add("Holmenkollen Ski Museum");
        graph.addNode(new Node("Holmenkollen", hDestinations));

        ArrayList<String> mDestinations = new ArrayList<>();
        mDestinations.add("x");
        mDestinations.add("x");
        mDestinations.add("x");
        graph.addNode(new Node("Majorstuen", mDestinations));

        ArrayList<String> nyDestinations = new ArrayList<>();
        nyDestinations.add("x");
        nyDestinations.add("x");
        nyDestinations.add("x");
        graph.addNode(new Node("Nydalen", nyDestinations));



        ArrayList<String> nDestinations = new ArrayList<>();
        nDestinations.add("Karl johan");
        nDestinations.add("Paleet");
        nDestinations.add("Norli universitetsgata");
        graph.addNode(new Node("Nationaltheateret", nDestinations));


        ArrayList<String> sDestinations = new ArrayList<>();
        sDestinations.add("Opera");
        sDestinations.add("Akershus festning");
        sDestinations.add("Nasjonalmuseet Arkitektur");
        sDestinations.add("Forsvarsmuseet");
        graph.addNode(new Node("Sentralstation", sDestinations));





        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);



        graph.print();
    }
}


