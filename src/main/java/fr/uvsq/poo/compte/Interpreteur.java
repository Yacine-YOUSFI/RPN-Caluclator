package fr.uvsq.poo.compte;

import java.util.Stack;

public class Interpreteur {
    private Stack<Undo> historique;
    private Joystick interp;

    public Interpreteur() {
        
        this.historique = new Stack<Undo>();
        this.interp= new Joystick();
    }

    private void executeCommand(Command command) {
        command.excuter();
    }
    public void applyStoreCommand(Undo command) {
            command.excuter();
            this.historique.add(command);
    }
    public void shutdown() {
        this.executeCommand(new Quit(interp));
    }


}