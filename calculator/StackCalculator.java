import java.util.Stack;

public class StackCalculator {
    private Stack<Integer> stack;

    public StackCalculator() {
        stack = new Stack<>();
    }

    public void push(int number) {
        stack.push(number);
    }

    public int pop() {
        EmptyStack emp = new EmptyStack();

        try {
            emp.checkStack(stack.size(), 1);

            return stack.pop();
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int add() {
        int number1, number2;
        EmptyStack emp = new EmptyStack();
        Overflow ov = new Overflow();

        try {
            emp.checkStack(stack.size(), 2);

            number1 = stack.pop();
            number2 = stack.pop();

            ov.checkAddingOverflow(number1, number2);

            return number1 + number2;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int sub() {
        int number1, number2;
        EmptyStack emp = new EmptyStack();

        try {
            emp.checkStack(stack.size(), 2);

            number1 = stack.pop();
            number2 = stack.pop();

            if (number1 > number2)
                return number1 - number2;
            else
                return number2 - number1;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int mul() {
        int number1, number2;
        EmptyStack emp = new EmptyStack();
        Overflow ov = new Overflow();

        try {
            emp.checkStack(stack.size(), 2);

            number1 = stack.pop();
            number2 = stack.pop();

            ov.checkMultipOverflow(number1, number2);

            return number1 * number2;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int div() {
        int number1, number2;
        DivByZero div = new DivByZero();
        EmptyStack emp = new EmptyStack();

        try {
            emp.checkStack(stack.size(), 2);

            number1 = stack.pop();
            number2 = stack.pop();

            div.checkIfZero(number1, number2);

            if (number1 > number2)
                return number1 / number2;
            else
                return number2 / number1;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int neg() {
        EmptyStack emp = new EmptyStack();

        try {
            emp.checkStack(stack.size(), 1);

            return -stack.pop();
        }
        catch (Exception e) {
            return 1;
        }
    }
}