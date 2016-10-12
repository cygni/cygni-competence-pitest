package se.cygni.game.tournament;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TournamentUtilTest {

    @Test
    public void testGetNoofLevelsRoundsUp() throws Exception {

        assertEquals(
                5,
                TournamentUtil.getNoofLevels(100, 10));
    }

    @Test
    public void testGetNoofLevelsConditionalPlayersLessThanOrEqualMaxPlayers() throws Exception {

        assertEquals(
                1,
                TournamentUtil.getNoofLevels(8, 10));

        assertEquals(
                1,
                TournamentUtil.getNoofLevels(9, 10));

        assertEquals(
                1,
                TournamentUtil.getNoofLevels(10, 10));
    }

    @Test
    public void testGetNoofLevelsConditionalPlayersLessThanOne() throws Exception {

        assertEquals(
                1,
                TournamentUtil.getNoofLevels(1, 10));

        assertEquals(
                0,
                TournamentUtil.getNoofLevels(0, 10));

        assertEquals(
                0,
                TournamentUtil.getNoofLevels(-1, 10));
    }

}