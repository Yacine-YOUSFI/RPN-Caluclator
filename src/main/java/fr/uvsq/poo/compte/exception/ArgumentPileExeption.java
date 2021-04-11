package fr.uvsq.poo.compte.exception;

/**
 * @author YOUSFI Yacine
 */
public class ArgumentPileExeption extends  IllegalArgumentException{
    /**
     * Constructeur de l'exception
     */
    public ArgumentPileExeption() {
        super("Cette opération ne peut pas etre éffectué car le nombre d'élément dans la pile est insuffisant");
    }
}
