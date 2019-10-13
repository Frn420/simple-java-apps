import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class AntiSystem implements Voter {
    public Candidate vote(Map<Candidate, String> list) {
        Set<Candidate> candidates = list.keySet();
        ArrayList<Candidate> voteCandidates = new ArrayList<>();

        for (Candidate c: candidates)
            if (list.get(c) == null)
                voteCandidates.add(c);

        if (voteCandidates.size() == 0) {
            return null;
        }
        else {
            Random r = new Random();
            if (r.nextInt(2) == 0) {
                return null;
            }
            else {
                return voteCandidates.get(r.nextInt(voteCandidates.size()));
            }
        }
    }
}
