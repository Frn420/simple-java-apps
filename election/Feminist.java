import java.util.Map;
import java.util.Set;

public class Feminist implements Voter {
    public Candidate vote(Map<Candidate, String> list) {
        Candidate result = null;
        Set<Candidate> candidates = list.keySet();

        for (Candidate c: candidates) {
            if (c.isWoman()) {
                if (result == null || result.getLastName().compareTo(c.getLastName()) < 0) {
                    result = c;
                }
                else if (result.getLastName().compareTo(c.getLastName()) == 0) {
                    if (result.getName().compareTo(c.getName()) < 0) {
                        result = c;
                    }
                }
            }
        }

        return result;
    }
}
