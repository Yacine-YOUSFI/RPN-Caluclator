package fr.uvsq.poo.compte;

import java.util.Stack;

public class MoteurRPN extends Interpreteur {
    private Stack<Integer> pile;

    public MoteurRPN() {
        this.pile = new Stack<Integer>();
    }

    public String afficherPile() {
        String exp = "<<";
        for (Integer in : this.pile) {
            exp += (in + " ");
        }
        return exp.trim() + ">>";
    }

    public void enregistrerNombreCommande(Integer nb) {
        this.applyStoreCommand(new EnregistrerCommand(pile, nb));

    }
    public void excuterOperations(Operations op) {
        this.applyStoreCommand(new OperationsCommand(pile, op));
    }

}