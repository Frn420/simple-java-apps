public class EmptyStack extends Exception {
    public void checkStack(int stack_size, int get_size) throws Exception {
        if (get_size > stack_size) {
            System.out.println("Empty stack");
            throw new Exception();
        }
    }
}
