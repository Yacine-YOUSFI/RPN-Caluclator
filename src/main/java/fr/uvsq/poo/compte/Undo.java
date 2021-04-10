package fr.uvsq.poo.compte;

import java.util.Stack;

public class Undo implements Command {

    private Stack<Integer> derniereCommande;

    public  Undo (Stack<Integer> derniereCommande){
        this.derniereCommande=derniereCommande;
    }

    @Override
    public void excuter() {
        derniereCommande.pop();
    }
}
