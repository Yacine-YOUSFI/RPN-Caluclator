package fr.uvsq.poo.compte;

import java.util.Stack;

/**
 * @author yacine
 */

public class EnregistrerCommand implements Command {
    private Integer nb;
    private Stack<Integer> pile;
// Cette classe permet de stocker les opérandes dans la pile

    public EnregistrerCommand(Stack<Integer> pile, Integer nb) {
        this.pile = pile;
        this.nb = nb;
    }
    public void excuter() {
        this.pile.push(nb);
    }


    public void undo() {
        this.pile.pop();
    }

}
