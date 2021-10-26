package homework;

import org.junit.Assert;
import org.junit.Test;

public class appTest {

    private String INPUT = "1234567";

    @Test
    public void testLength() {
        Assert.assertEquals(64, app.sha256hex(INPUT).length());
    }

    @Test
    public void testHex() {
        String expected = "8bb0cf6eb9b17d0f7d22b456f121257dc1254e1f01665370476383ea776df414";
        Assert.assertEquals(expected, app.sha256hex(INPUT));
    }

}