package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SommeTUTest extends SommeTU {

    @Test
    void sommeDeuxEntiers() {
        int a = 5;
        int b = 2;
        assertEquals(7, sommeDeuxEntiers(a, b));
    }
}
