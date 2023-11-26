package de.schlueter.matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MatchTest {
    @Test
    public void testMatch() {
        Match sut = new Match();
        String result = sut.match("abc", "abc");

        assertEquals("abc", result);
    }

    @Test
    public void matchWithDot() {
        Match sut = new Match();
        String result = sut.match("a.c", "abc");

        assertEquals("abc", result);
    }

    @Test
    public void matchMultipleWords() {
        Match sut = new Match();
        String result = sut.match("abc", "abc def abc");

        assertEquals("abc", result);
    }
}
