package fr.uvsq.poo.compte;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterpreteurTest {
    @Test
    public void testisOn() {
        Interpreteur i= new Interpreteur();
        assertEquals(false, i.isOn());
    }
}
