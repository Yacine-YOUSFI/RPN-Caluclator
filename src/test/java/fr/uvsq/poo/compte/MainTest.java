package fr.uvsq.poo.compte;

import org.junit.Test;

import java.util.Stack;

/**
 * @author YOUSFI Yacine
 */

import static org.junit.Assert.assertEquals;
import fr.uvsq.poo.compte.Interpreteur;
import fr.uvsq.poo.compte.MoteurRPN;

import fr.uvsq.poo.compte.SaisieRPN;
import fr.uvsq.poo.compte.Operations;


public class MainTest {
    @Test
    public void testExecution(){
      MoteurRPN r= new MoteurRPN();
    r.enregistrerNombreCommande(5);
        r.enregistrerNombreCommande(10);

        SaisieRPN d= new SaisieRPN();
    Operations PLUS= Operations.PLUS;
    OperationsCommand o= new OperationsCommand(r.getpile(),PLUS);
    o.excuter();


    assertEquals("<<15>>", r.afficherPile());

    }

    @Test
    public void testExecution2(){
        MoteurRPN r= new MoteurRPN();
        r.enregistrerNombreCommande(5);
        r.enregistrerNombreCommande(10);

        SaisieRPN d= new SaisieRPN();
        Operations PLUS= Operations.MOINS;
        OperationsCommand o= new OperationsCommand(r.getpile(),Operations.MOINS);
        o.excuter();


        assertEquals("<<-5>>", r.afficherPile());

    }

    @Test
    public void testExecution3(){
        MoteurRPN r= new MoteurRPN();
        r.enregistrerNombreCommande(5);
        r.enregistrerNombreCommande(2);

        SaisieRPN d= new SaisieRPN();
        Operations PLUS= Operations.MULT;
        OperationsCommand o= new OperationsCommand(r.getpile(),Operations.MULT);
        o.excuter();


        assertEquals("<<10>>", r.afficherPile());

    }

}
