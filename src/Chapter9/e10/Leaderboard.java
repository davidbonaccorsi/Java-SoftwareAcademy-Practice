package Chapter9.e10;

import java.util.*;

public class Leaderboard<T>{

    private final Map<T, List<Integer>> storage = new HashMap<>();

    public void addScore(T playerId, Integer score){
//        List<Integer> playerScores;
//
//        if(storage.containsKey(playerId)){
//            playerScores = storage.get(playerId);
//        } else {
//            playerScores = new ArrayList<>();
//        }
//
//        playerScores.add(score);
//        storage.put(playerId, playerScores);

        storage.computeIfAbsent(playerId,k -> new ArrayList<>()).add(score);
        System.out.println("Added score " + score + " to player: " + playerId);
    }

    public double getPlayerAverage(T playerId){
        List<Integer> playerScores;
        double average = 0;

        playerScores = storage.get(playerId);

        if(playerScores == null || playerScores.isEmpty()){
            return 0.0;
        }

        for(Integer score : playerScores){
            average+= score;
        }

        return average/playerScores.size();
    }

    public List<T> getTopPlayersByMaxScore(int n){
        List<Map.Entry<T, Integer>> maxScores = new ArrayList<>();

        for(Map.Entry<T, List<Integer>> entry : storage.entrySet()){
            T playerId = entry.getKey();
            List<Integer> scores = entry.getValue();

            if(!scores.isEmpty()){
                int highestScore = Collections.max(scores);
                maxScores.add(new AbstractMap.SimpleEntry<>(playerId, highestScore));
            }
        }

        maxScores.sort((s1, s2) -> s2.getValue().compareTo(s1.getValue()));

        List<T> result = new ArrayList<>();

        int limit = Math.min(n, maxScores.size());

        for(int i = 0; i < limit; i++){
            result.add(maxScores.get(i).getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        // TEST DATA
        Leaderboard<String> lb = new Leaderboard<>();
        lb.addScore("Alice", 100);
        lb.addScore("Bob", 80);
        lb.addScore("Alice", 120); // Alice max is 120
        lb.addScore("Charlie", 50);
        lb.addScore("Bob", 150);   // Bob max is 150
        lb.addScore("Dave", 90);

        // Expected Output:
        // Bob Average: 115.0
        System.out.println("Bob Avg: " + lb.getPlayerAverage("Bob"));

        // Expected Top 2 (By Max Score): [Bob, Alice]
        // Bob (150), Alice (120), Dave (90), Charlie (50)
        System.out.println("Top 2: " + lb.getTopPlayersByMaxScore(2));
    }
}
