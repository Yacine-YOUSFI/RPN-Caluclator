package fr.uvsq.poo.compte;

import java.util.Stack;
/**
 * @author YOUSFI Yacine
 */
public class OperationsCommand implements Command{
    private Integer sommet;
    private Integer avantSommet;
    private Operations operation;
    private Stack<Integer> pile;

    /**
     * Constructeur de la classe
     * @param pile
     * @param operation
     */
    public OperationsCommand(Stack<Integer> pile, Operations operation) {
        this.pile = pile;
        this.operation = operation;
    }

    /**
     * Implementation de la methode executer l'opération en dépilant deux opérandes depuis la pile
     */
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

    /**
     * La methode undo permet de dépiler un élément de la pile
     */
    public void undo() {

        this.pile.pop();
    }
}
