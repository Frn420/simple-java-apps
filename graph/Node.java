import java.util.ArrayList;

public class Node {
    private ArrayList<Integer> neighbours;
    private ArrayList<Integer> lengths;

    public Node() {
        neighbours = new ArrayList<>();
        lengths = new ArrayList<>();
    }

    public void addNeighbour(int node, int length) {
        neighbours.add(node);
        lengths.add(length);
    }

    public ArrayList<Integer> getNeighbours() {
        return neighbours;
    }

    public ArrayList<Integer> getLengths() {
        return lengths;
    }
}