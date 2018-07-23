package pluto.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MatchTest {
    private Match match;

    @Before
    public void setup() {
        this.match = new Match("North London", "Hot and sunny");
    }

    @Test
    public void expectLocationToBeNorthLondon() {
        assertEquals("North London", match.getLocation());
    }

    @Test
    public void tossCreatesInnings() {
        match.toss("TPCC", "Kew CC");
        assertEquals("TPCC 0-0\nKew CC 0-0\n", match.getSmallScore());
    }
}