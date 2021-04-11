package fr.uvsq.poo.compte;

/**
 * @author YOUSFI Yacine
 * Cette classe permet de sortir et mettre fin au programme
 *
 */

public class Quit implements Command {


    private Joystick joykey;

    /**
     * Constructeur de la classe quit
     * @param key
     */

    public Quit(Joystick key) {
        this.joykey = key;
    }

    /**
     * Implementation de la methode executer()
     */
    @Override
    public void excuter() {
        joykey.turnOff();
    }
}