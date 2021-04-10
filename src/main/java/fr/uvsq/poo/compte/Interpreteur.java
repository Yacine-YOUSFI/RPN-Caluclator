package fr.uvsq.poo.compte;

import java.util.Stack;

public class Interpreteur {
    private Stack<Command> historique;
    private Joystick interp;

    public Interpreteur() {
        
        this.historique = new Stack<Command>();
        this.interp= new Joystick();
    }

    public void executeCommand(Command command) {
        command.excuter();
    }
    public void applyStoreCommand(Command com) {
            com.excuter();
            this.historique.add(com);
    }
    public void shutdown() {
        this.executeCommand(new Quit(interp));
    }


    public boolean isOn() {
        return interp.isOn();
    }
}