public class Candidate {
    private String name;
    private String lastName;
    private boolean woman;

    public Candidate(String name, String lastName, boolean woman) {
        this.name = name;
        this.lastName = lastName;
        this.woman = woman;
    }

    public boolean isWoman() {
        return woman;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
