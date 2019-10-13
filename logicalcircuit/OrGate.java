import java.util.ArrayList;

public class OrGate extends Gate {
    public OrGate() {
        inGates = 0;
        inValue = 0;
        outGates = new ArrayList<>(0);
        setValue();
    }

    public void setValue() {
        value = inValue > 0;
    }
}
