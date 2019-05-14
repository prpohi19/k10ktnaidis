package joogid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoogivaatTest {

    Jook mahl = new Jook("Mahl", 15, 20);
    Joogivaat joogivaat = new Joogivaat(120, 10, mahl);
    Joogipudel mahlaPudel = new Joogipudel(20, "Poolene", 10, 1, mahl);
    @Test
    void fill() {
        assertTrue(joogivaat.fill(mahlaPudel));
    }

}