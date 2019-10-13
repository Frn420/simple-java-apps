import java.util.ArrayList;

public class EnterGate extends Gate {
    public EnterGate(boolean enterValue) {
        outGates = new ArrayList<>();
        value = enterValue;
    }

    public void setValue() {}
}
