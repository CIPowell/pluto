package pluto.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MatchTest {
    private Match match;

    @Before
    public void setup() {
        this.match = new Match();

        this.match.setLocation("North London");
    }

    @Test
    public void expectLocationToBeNorthLondon() {
        assertEquals("North London", match.getLocation());
    }
}