public class DivByZero extends Exception{
    public void checkIfZero(int number1, int number2) throws Exception {
        if (number1 == 0 || number2 == 0) {
            System.out.println("Divide by zero");
            throw new Exception();
        }
    }
}
