import java.util.ArrayList;

public class ParityGate extends Gate {
    public ParityGate() {
        inGates = 0;
        inValue = 0;
        outGates = new ArrayList<>(0);
        setValue();
    }

    public void setValue() {
        value = (inValue % 2) == 1;
    }
}
