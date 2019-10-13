import java.util.ArrayList;

public abstract class Gate {
    protected int inGates;
    protected int inValue;
    protected ArrayList<Gate> outGates;
    protected boolean value;

    public void getInValue(boolean value) {
        inGates++;
        if (value)
            inValue++;
    }

    public void addOutGate(Gate outGate) {
        outGates.add(outGate);
        outGate.getInValue(value);
        outGate.setValue();
    }

    public boolean isExit() {
        return outGates.size() == 0;
    }

    public abstract void setValue();

    public boolean getValue() {
        return value;
    }
}
