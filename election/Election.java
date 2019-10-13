import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Election {
    private List<Voter> voters;
    private String result;

    public Election(List<Voter> voters) {
        this.voters = voters;
    }

    private static List<Result> sort(List<Result> list) {
        int max;
        int index = 0;
        List<Result> newList = new ArrayList<>();

        while (list.size() > 0) {
            max = 0;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getVotes() >= max) {
                    max = list.get(i).getVotes();
                    index = i;
                }
            }

            newList.add(list.get(index));
            list.remove(index);
        }

        return newList;
    }

    public void election(Map<Candidate, String> list) {
        List<Result> results = new ArrayList<>();
        Set<Candidate> candidates = list.keySet();
        int votes = 0;
        int validVotes = 0;

        for (Candidate c: candidates)
            results.add(new Result(c, list.get(c)));

        for (Voter v: voters) {
            Candidate c = v.vote(list);
            votes++;
            if (c != null) {
                validVotes++;

                for (Result r: results)
                    if (r.getName().getLastName().equals(c.getLastName()) && r.getName().getName().equals(c.getName()))
                        r.vote();
            }
        }

        results = sort(results);
        DecimalFormat df = new DecimalFormat("###.##");
        float number1 = validVotes;
        float number2 = votes;
        float percent = (number1/ number2) * 100;
        result = "Turnout " + df.format(percent) + "%\n";

        for (Result r: results) {
            number1 = r.getVotes();
            number2 = validVotes;
            percent = (number1/ number2) * 100;
            result += r.toString() + df.format(percent) + "%\n";
        }
    }

    public String giveResults() {
        return result;
    }
}
