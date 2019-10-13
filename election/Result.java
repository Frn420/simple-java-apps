public class Result {
    private int votes;
    private Candidate candidate;
    private String party;

    public Result(Candidate candidate, String party) {
        this.candidate = candidate;
        this.party = party;
        votes = 0;
    }

    public void vote() {
        votes++;
    }

    public Candidate getName() {
        return candidate;
    }

    public int getVotes() {
        return votes;
    }

    public String toString() {
        if (party != null)
            return candidate.getLastName() + " (" + party + ") : ";
        else
            return candidate.getLastName() + " (Independent) : ";
    }
}
