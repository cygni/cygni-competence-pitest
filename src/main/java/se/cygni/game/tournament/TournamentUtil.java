package se.cygni.game.tournament;

public class TournamentUtil {

    /**
     * Calculates the number of levels needed to determine a winner in a final game
     * given the number of players and max number of players per game. The calculation
     * is based on the fact that the number of games in each level is always 2^levelIndex.
     *
     * @param noofPlayers
     * @param maxNoofPlayersPerGame
     * @return The numbers of levels needed to establish a winner.
     */
    public static int getNoofLevels(int noofPlayers, int maxNoofPlayersPerGame) {
        if (noofPlayers < 1) {
            return 0;
        }

        if (noofPlayers <= maxNoofPlayersPerGame) {
            return 1;
        }

        double level = Math.sqrt((double) noofPlayers / (double) maxNoofPlayersPerGame);
        return (int)Math.ceil(level) + 1;
    }
}
