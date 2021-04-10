package fr.uvsq.poo.compte.exception;

/**
 * Exception pour la division par zéro
 * @author RAHMANI NADJIB
 */
public class DivisionParZeroException extends ArithmeticException {

    /**
     * Constructeur de l'exception
     */
    public DivisionParZeroException() {
        super("Division par zéro,erreur");
    }

}
