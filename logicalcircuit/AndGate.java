import java.util.ArrayList;

public class AndGate extends Gate {
    public AndGate() {
        inGates = 0;
        inValue = 0;
        outGates = new ArrayList<>(0);
        setValue();
    }

    public void setValue() {
        value = inGates == inValue;
    }
}
