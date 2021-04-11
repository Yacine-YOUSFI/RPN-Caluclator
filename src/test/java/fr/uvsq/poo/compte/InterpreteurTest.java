package fr.uvsq.poo.compte;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author YOUSFI Yacine
 */

public class InterpreteurTest {
    @Test
    public void testisOn() {
        Interpreteur i= new Interpreteur();
        assertEquals(true, i.isOn());
    }
}
