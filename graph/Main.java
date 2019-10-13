public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.connectNodes(0, 1, 4);
        graph.connectNodes(0, 2, 1);
        graph.connectNodes(1, 3, 5);
        graph.connectNodes(2, 3, 10);
        graph.connectNodes(2, 4, 1);
        graph.connectNodes(4, 5, 1);
        graph.connectNodes(3, 5, 1);

        System.out.println(graph.distance(0, 3));
    }
}
