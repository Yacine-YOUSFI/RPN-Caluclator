package fr.uvsq.poo.compte;
import fr.uvsq.poo.compte.exception.*;
/**
 * enum gérant les quatres opérations de la calculatrice +,*,-,/
 * @author Rahmani Nadjib
 *
 */

public enum Operations {

    PLUS('+') {
        public Integer oper (Integer x, Integer y){
            return x + y;
        }

    },

    MOINS('-') {
        public Integer oper (Integer x, Integer y){
            return x - y;
        }

    },
    MULT('*'){

        public Integer oper(Integer x, Integer y) {
            return x * y;
        }

    },

    DIV('/'){

        public Integer oper(Integer x, Integer y) {
            if(y == 0) {
                throw new DivisionParZeroException();
            }
            return x / y;
        }

    };
    private char operande;
    /**
     * Initialisation de l'opération(Constrecteur)
     * @param operande
     */
    private Operations(char operande) {
        this.operande = operande;
    }
    /**
     * méthode d'évaluation abstraite (redéfinie pour chaque opération).
     * @param x
     * @param y
     */
    public abstract Integer oper(Integer x , Integer y);
    /**
     * récupération d'operande de l'opération
     * @return the operande
     */
    public char getOperande() {
        return operande;
    }

}