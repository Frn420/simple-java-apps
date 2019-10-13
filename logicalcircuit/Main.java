public class Main {

    public static void main(String[] args) {
        Circuit cir = new Circuit();

        cir.addGate(new EnterGate(true));
        cir.addGate(new EnterGate(false));
        cir.addGate(new EnterGate(true));
        cir.addGate(new AndGate());
        cir.addGate(new OrGate());
        cir.addGate(new OrGate());
        cir.addGate(new AndGate());
        cir.addGate(new MajorityGate());
        cir.addGate(new AndGate());
        cir.addGate(new ParityGate());
        cir.addGate(new AndGate());
        cir.addGate(new NotGate());
        cir.addGate(new AndGate());
        cir.addGate(new OrGate());

        cir.connectGateTo(0, 3);
        cir.connectGateTo(0, 4);
        cir.connectGateTo(0, 6);
        cir.connectGateTo(1, 4);
        cir.connectGateTo(1, 7);
        cir.connectGateTo(2, 3);
        cir.connectGateTo(2, 8);
        cir.connectGateTo(3, 4);
        cir.connectGateTo(3, 5);
        cir.connectGateTo(3, 7);
        cir.connectGateTo(3, 8);
        cir.connectGateTo(4, 5);
        cir.connectGateTo(4, 7);
        cir.connectGateTo(4, 10);
        cir.connectGateTo(4, 12);
        cir.connectGateTo(5, 10);
        cir.connectGateTo(5, 9);
        cir.connectGateTo(6, 9);
        cir.connectGateTo(6, 8);
        cir.connectGateTo(7, 10);
        cir.connectGateTo(7, 13);
        cir.connectGateTo(8, 9);
        cir.connectGateTo(8, 12);
        cir.connectGateTo(9, 12);
        cir.connectGateTo(10, 13);
        cir.connectGateTo(11, 12);
        cir.connectGateTo(12, 13);
        cir.connectGateTo(8, 11);
        cir.connectGateTo(11, 13);

        if (cir.getValue())
            System.out.println("tak");
        else
            System.out.println("nie");
    }
}
