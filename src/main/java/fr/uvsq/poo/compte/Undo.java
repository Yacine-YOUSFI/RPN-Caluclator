package fr.uvsq.poo.compte;

import java.util.Stack;

public class Undo implements Command {

    private Stack<Command> derniereCommande;

    public  Undo (){
        excuter();
    }

    @Override
    public void excuter() {
        derniereCommande.pop();
    }
}
