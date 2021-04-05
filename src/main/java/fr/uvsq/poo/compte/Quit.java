package fr.uvsq.poo.compte;

public class Quit implements Command {


    private Joystick joykey;

    public Quit(Joystick key) {
        this.joykey = key;
    }
    public void excuter() {
        joykey.turnOff();
    }
}