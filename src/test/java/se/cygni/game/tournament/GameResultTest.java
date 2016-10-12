package se.cygni.game.tournament;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameResultTest {

    @Test
    public void testGetNoofPlayers() throws Exception {
        GameResult gameResult = new GameResult();

        assertEquals(0, gameResult.getNoofPlayers());

        gameResult.addPlayerAndPoints("KoncernChief", 7);
        assertEquals(1, gameResult.getNoofPlayers());

        gameResult.addPlayerAndPoints("Helmet", 23);
        assertEquals(2, gameResult.getNoofPlayers());

        gameResult.addPlayerAndPoints("Snaake", 2);
        assertEquals(3, gameResult.getNoofPlayers());

        gameResult.addPlayerAndPoints("OfficeMgr", 17);
        assertEquals(4, gameResult.getNoofPlayers());
    }

    @Test
    public void testAddPlayerAndPoints() throws Exception {
        GameResult gameResult = new GameResult();

        assertEquals(0, gameResult.getNoofPlayers());

        gameResult.addPlayerAndPoints("KoncernChief", 7);
        gameResult.addPlayerAndPoints("Helmet", 23);
        gameResult.addPlayerAndPoints("Snaake", 2);
        gameResult.addPlayerAndPoints("OfficeMgr", 17);

        assertEquals(7, gameResult.getPointsForPlayer("KoncernChief"));
        assertEquals(23, gameResult.getPointsForPlayer("Helmet"));
        assertEquals(2, gameResult.getPointsForPlayer("Snaake"));
        assertEquals(17, gameResult.getPointsForPlayer("OfficeMgr"));
    }

    @Test
    public void testGetPlayerInRank() throws Exception {
        GameResult gameResult = new GameResult();

        assertEquals(0, gameResult.getNoofPlayers());

        gameResult.addPlayerAndPoints("KoncernChief", 7);
        gameResult.addPlayerAndPoints("Helmet", 23);
        gameResult.addPlayerAndPoints("Snaake", 2);
        gameResult.addPlayerAndPoints("OfficeMgr", 17);

        assertEquals("Helmet", gameResult.getPlayerInRank(0));
        assertEquals("OfficeMgr", gameResult.getPlayerInRank(1));
        assertEquals("KoncernChief", gameResult.getPlayerInRank(2));
        assertEquals("Snaake", gameResult.getPlayerInRank(3));
    }

    @Test
    public void testGetNonExistingPlayer() throws Exception {
        GameResult gameResult = new GameResult();

        assertEquals(0, gameResult.getNoofPlayers());

        gameResult.addPlayerAndPoints("KoncernChief", 7);
        gameResult.addPlayerAndPoints("Helmet", 23);

        assertEquals(0, gameResult.getPointsForPlayer("not_known"));
    }
}