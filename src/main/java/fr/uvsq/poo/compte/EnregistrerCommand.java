package fr.uvsq.poo.compte;

import java.util.Stack;

/**
 *
 * @author YOUSFI Yacine
 */

public class EnregistrerCommand implements Command {
    private Integer nb;
    private Stack<Integer> pile;

    /**
     * Constructeur de la classe EnregistrerCommand
     * @param pile
     * @param nb
     */

    public EnregistrerCommand(Stack<Integer> pile, Integer nb) {
        this.pile = pile;
        this.nb = nb;
    }

    /**
     * Empilement d'un entier dans une pile
     */
    public void excuter() {
        this.pile.push(nb);
    }

    /**
     * Cette méthode permet de dépiler un élément de la pile
     */
    public void undo() {
        this.pile.pop();
    }

}
