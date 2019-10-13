import java.util.Map;

public interface Voter {
    public Candidate vote(Map<Candidate, String> list);
}
