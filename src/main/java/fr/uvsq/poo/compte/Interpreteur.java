package fr.uvsq.poo.compte;

import java.util.Stack;

/**
 * @author YOUSFI Yacine
 * Implementation de la classe Interpreteur
 */

public class Interpreteur {
    private Stack<Command> historique;
    private Joystick interp;

    /**
     * Constructeur de la classe
     */
    public Interpreteur() {
        
        this.historique = new Stack<Command>();
        this.interp= new Joystick();
    }

    /**
     * Permet l'éxécution d'une commande
     * @param command
     */
    public void executeCommand(Command command) {
        command.excuter();
    }

    /**
     * Ajouter une commande a l'historique
     * @param com
     */
    public void applyStoreCommand(Command com) {
            com.excuter();
            this.historique.add(com);
    }

    /**
     * Permet d'executer une commande  de quit
     */
    public void shutdown() {
        this.executeCommand(new Quit(interp));
    }

    /**
     * Verifier que l'interepteur est activé
     * @return un boolean
     */
    public boolean isOn() {
        return interp.isOn();
    }
}