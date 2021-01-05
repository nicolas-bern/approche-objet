package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SommeTUTest {

    static SommeTU somme;

    @BeforeAll
    static void setUp(){
        somme = new SommeTU();
    }

    @Test
    void sommeDeuxEntiers() {
        int a = 5;
        int b = 2;
        assertEquals(9, somme.sommeDeuxEntiers(a, b));
    }
}
