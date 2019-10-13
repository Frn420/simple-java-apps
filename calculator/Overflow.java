public class Overflow {
    public void checkAddingOverflow(int number1, int number2) throws Exception {
        if (number1 > Integer.MAX_VALUE - number2) {
            System.out.println("Overflow");
            throw new Exception();
        }
    }

    public void checkMultipOverflow(int number1, int number2) throws Exception {
        if (number1 > Integer.MAX_VALUE / number2) {
            System.out.println("Overflow");
            throw new Exception();
        }
    }
}
