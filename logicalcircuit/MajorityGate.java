import java.util.ArrayList;

public class MajorityGate extends Gate {
    public MajorityGate() {
        inGates = 0;
        inValue = 0;
        outGates = new ArrayList<>(0);
        setValue();
    }

    public void setValue() {
        value = inValue > (inGates / 2);
    }
}
