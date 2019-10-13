import java.util.ArrayList;

public class Circuit {
    private ArrayList<Gate> gates;

    public Circuit() {
        gates = new ArrayList<>();
    }

    public void addGate(Gate gate) {
        gates.add(gate);
    }

    public void connectGateTo(int index1, int index2) {
        gates.get(index1).addOutGate(gates.get(index2));
    }

    public boolean getValue() {
        for (Gate g: gates)
            if (g.isExit())
                return g.getValue();

        return false;
    }
}
