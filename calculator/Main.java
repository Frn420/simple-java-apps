public class Main {
    public static void main(String[] args) {
        int result;
        Parser par = new Parser();

        par.getCommand("PUSH<466>");
        par.getCommand("PUSH<78>");
        par.getCommand("PUSH<56>");
        par.getCommand("PUSH<2313>");
        par.getCommand("PUSH<833>");
        par.getCommand("PUSH<585>");

        result = par.getCommand("POP");
        if (result != -1)
            System.out.println(result);

        result = par.getCommand("ADD");
        if (result != -1)
            System.out.println(result);

        result = par.getCommand("MUL");
        if (result != -1)
            System.out.println(result);

        result = par.getCommand("DIV");
        if (result != -1)
            System.out.println(result);

        result = par.getCommand("NEG");
        if (result != 1)
            System.out.println(result);
    }
}