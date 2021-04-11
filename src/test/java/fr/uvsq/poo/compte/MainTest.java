package fr.uvsq.poo.compte;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;
import fr.uvsq.poo.compte.Interpreteur;
import fr.uvsq.poo.compte.MoteurRPN;

import fr.uvsq.poo.compte.SaisieRPN;
import fr.uvsq.poo.compte.Operations;


public class MainTest {
    @Test
    public void testExecution(){
        Stack<Integer> p=new Stack<>();
        p.push(43);
        p.push(2);
        p.push(5);
        p.push(8);

        assertEquals(false, p.isEmpty());
    MoteurRPN r= new MoteurRPN();
    SaisieRPN d= new SaisieRPN();
    Operations PLUS= Operations.PLUS;
    OperationsCommand o= new OperationsCommand(p,PLUS);
    o.excuter();
    

    assertEquals(13, r.afficherPile());

    }

}
