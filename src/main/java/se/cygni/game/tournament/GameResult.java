package se.cygni.game.tournament;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.TreeSet;

public class GameResult {

    private TreeSet<PlayerScore> playerScoreSortedSet;

    public GameResult() {
        playerScoreSortedSet = new TreeSet<>(new Comparator<PlayerScore>() {
            @Override
            public int compare(PlayerScore o1, PlayerScore o2) {
                return Integer.compare(o2.getPoints(), o1.getPoints());
            }
        });
    }

    public void addPlayerAndPoints(String player, int points) {
        playerScoreSortedSet.add(new PlayerScore(player, points));
    }

    public int getPointsForPlayer(String player) {
        Optional<PlayerScore> foundPlayer = playerScoreSortedSet.
                stream().
                filter(playerScore -> playerScore.getPlayer().equals(player)).
                findFirst();

        if (foundPlayer.isPresent()) {
            return foundPlayer.get().getPoints();
        }

        return 0;
    }

    public int getNoofPlayers() {
        return playerScoreSortedSet.size();
    }

    public String getPlayerInRank(int rank) {
        return new ArrayList<PlayerScore>(playerScoreSortedSet).get(rank).getPlayer();
    }

    private class PlayerScore {
        private final String player;
        private final int points;

        public PlayerScore(String player, int points) {
            this.player = player;
            this.points = points;
        }

        public String getPlayer() {
            return player;
        }

        public int getPoints() {
            return points;
        }
    }
}
