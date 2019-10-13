public class Parser {
    private StackCalculator stack;

    public Parser() {
        stack = new StackCalculator();
    }

    private int checkPush(String command) throws Exception {
       int counter = command.length() - 1;
       int multiplier = 1;
       int result = 0;
       WrongInput wr = new WrongInput();

       if (command.charAt(counter) != '>')
           wr.throwExc();

       counter--;

       while (counter >= 4 && command.charAt(counter) != '<') {
           if (command.charAt(counter) >= '0' && command.charAt(counter) <= '9')
               result += multiplier * (command.charAt(counter) - '0');
           else
               wr.throwExc();

           multiplier *= 10;
           counter--;
       }

       if (command.length() > 5) {
           if (command.charAt(0) != 'P')
               wr.throwExc();
           if (command.charAt(1) != 'U')
               wr.throwExc();
           if (command.charAt(2) != 'S')
               wr.throwExc();
           if (command.charAt(3) != 'H')
               wr.throwExc();
           if (command.charAt(4) != '<')
               wr.throwExc();
       }
       else {
           wr.throwExc();
       }

       return result;
    }

    public int getCommand(String command) {
        int result;

        switch (command) {
            case "POP":
                return stack.pop();
            case "ADD":
                return stack.add();
            case "SUB":
                return stack.sub();
            case "MUL":
                return stack.mul();
            case "DIV":
                return stack.div();
            case "NEG":
                return stack.neg();
            default:
                try {
                    result = checkPush(command);
                    stack.push(result);

                    return 1;
                }
                catch (Exception e) {
                    return -1;
                }
        }
    }
}