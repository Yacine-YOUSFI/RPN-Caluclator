package fr.uvsq.poo.compte;

import java.util.Stack;
/**
 * @author RAHMANI NADJIB
 * @class SaisieRPN qui prend en charge les operands , operations et commandes entré par l'user
 */
public class Undo implements Command {

    private Stack<Integer> derniereCommande;
    /**
     * Constrecutre de la classe
     * @param pile , la pile des operandes
     */
    public  Undo (Stack<Integer> pile){
        this.derniereCommande=pile;
    }

    @Override
    public void excuter() {
        derniereCommande.pop();
    }
}
