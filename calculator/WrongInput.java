public class WrongInput extends Exception{
    public void throwExc() throws Exception {
        System.out.println("Wrong input");
        throw new Exception();
    }
}
