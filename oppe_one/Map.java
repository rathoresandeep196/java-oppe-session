import java.util.*;

class Team {
    private Map<String, ArrayList<Integer>> playerMap;

    public Team(Map<String, ArrayList<Integer>> m) {
        playerMap = m;
    }

    public Map<String, ArrayList<Integer>> getPlayerMap() {
        return playerMap;
    }
}

public class FClass {
    public static ArrayList<String> getFinalList(Team t) {
        // Define the method getFinalList( ) here

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> pmap =

                new LinkedHashMap<String, ArrayList<Integer>>();

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> pruns = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j < 3; j++) {
                pruns.add(sc.nextInt());
            }
            pmap.put(name, pruns);
        }
        Team t = new Team(pmap);
        System.out.println(getFinalList(t));
    }
}