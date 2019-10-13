import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Party implements Voter {
    private String party;

    public Party(String party) {
        this.party = party;
    }

    public Candidate vote(Map<Candidate, String> list) {
        Set<Candidate> candidates = list.keySet();
        ArrayList<Candidate> partyCandidates = new ArrayList<>();

        for (Candidate c: candidates)
            if (list.get(c) != null && list.get(c).equals(party))
                partyCandidates.add(c);

        if (partyCandidates.size() == 0)
            return null;
        else
            return partyCandidates.get(new Random().nextInt(partyCandidates.size()));
    }
}
