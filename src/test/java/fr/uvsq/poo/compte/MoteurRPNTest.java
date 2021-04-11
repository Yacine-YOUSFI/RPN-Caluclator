package fr.uvsq.poo.compte;

import org.junit.Test;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;
/**
 *
 * @author YOUSFI Yacine
 */

public class MoteurRPNTest {

        @Test()
        public void testAffichePile() {
            MoteurRPN m= new MoteurRPN();
            m.afficherPile();
            assertEquals("<<>>", m.afficherPile());
        }


    }


