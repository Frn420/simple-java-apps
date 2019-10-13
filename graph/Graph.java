import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Graph {
    private ArrayList<Node> nodes;

    public Graph(int n) {
        nodes = new ArrayList<>();

        for (int i = 0; i < n; i++)
            nodes.add(new Node());
    }

    public void connectNodes(int node1, int node2, int length) {
        nodes.get(node1).addNeighbour(node2, length);
        nodes.get(node2).addNeighbour(node1, length);
    }

    public int distance(int node1, int node2) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] lengths = new int[nodes.size()];
        int current = node1;
        for (int i = 0; i < lengths.length; i++)
            lengths[i] = Integer.MAX_VALUE;
        lengths[current] = 0;

        do {
            ArrayList<Integer> neighbours = nodes.get(current).getNeighbours();
            ArrayList<Integer> neighLengths = nodes.get(current).getLengths();

            for (int i = 0; i < neighbours.size(); i++) {
                if (neighLengths.get(i) + lengths[current] < lengths[neighbours.get(i)]) {
                    queue.add(neighbours.get(i));
                    lengths[neighbours.get(i)] = neighLengths.get(i) + lengths[current];
                }
            }

            current = queue.remove();
        } while (!queue.isEmpty());

        return lengths[node2];
    }
}
