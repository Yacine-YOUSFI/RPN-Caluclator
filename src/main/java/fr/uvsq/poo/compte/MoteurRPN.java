package fr.uvsq.poo.compte;

import fr.uvsq.poo.compte.exception.ArgumentPileExeption;

import java.util.Stack;
/**
 * @author RAHMANI NADJIB
 * @class MoteurRPN gestion de la pile des operandes (affichage ,empiler ,depiler et execution de l'operation)
 */
public class MoteurRPN extends Interpreteur {
    private Stack<Integer> pile;
    /**
     * Constrecteur de la classe qui cree la pile.
     */
    public MoteurRPN() {
        this.pile = new Stack<Integer>();
    }
    /**
     * affichage le contenu de la pile .
     */
    public String afficherPile() {
        String exp = "<<";
        for (Integer in : this.pile) {
            exp += (in + " ");
        }
        return exp.trim() + ">>";
    }
    /**
     * Ajoute une opérande nb dans la pile.
     */

    public void enregistrerNombreCommande(Integer nb) {
        this.applyStoreCommand(new EnregistrerCommand(pile, nb));

    }
    /**
     * Applique l'opération op aux deux  opérandes de la pile
     * @param op
     */
    public void excuterOperations(Operations op) {
        try {
            this.applyStoreCommand(new OperationsCommand(pile, op));

        }catch (Exception e){
            throw new ArgumentPileExeption();
        }
    }
    /**
     * Sup l'opérande au sommet de la pile
     */
    public void undo(){
        this.executeCommand(new Undo(pile));

    }
    public  Stack<Integer> getpile(){

        return  pile;
    }

}