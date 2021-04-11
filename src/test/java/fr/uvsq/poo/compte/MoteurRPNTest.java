package fr.uvsq.poo.compte;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MoteurRPNTest {

        @Test()
        public void testAffichePile() {
            MoteurRPN m= new MoteurRPN();
            m.afficherPile();
            assertEquals("hi", m.afficherPile());
        }
    }


