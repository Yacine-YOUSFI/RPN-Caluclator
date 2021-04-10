package fr.uvsq.poo.compte;

import java.util.Stack;
/**
 * @author yacine
 */
public class OperationsCommand implements Command{
    private Integer sommet;
    private Integer avantSommet;
    private Operations operation;
    private Stack<Integer> pile;

    public OperationsCommand(Stack<Integer> pile, Operations operation) {
        this.pile = pile;
        this.operation = operation;
    }

    public void excuter() {
        Integer resultat;
        this.sommet= this.pile.pop();
        this.avantSommet = this.pile.pop();
        try {
            resultat = operation.oper(avantSommet, sommet);
            this.pile.push(resultat);
        }
        catch (ArithmeticException e) {
            this.pile.push(avantSommet);
            this.pile.push(sommet);
            throw e;
        }
    }
    public void undo() {
        this.pile.pop();
    }
}
