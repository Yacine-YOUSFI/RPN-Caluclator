package fr.uvsq.poo.compte;

public class Joystick {
    private boolean key;
    public Joystick() {
        this.key = true;
    }
    public boolean isOn() {
        return key;
    }
    public void turnOff() {
        key = false;
    }
    public void turnOn() {
        key = true;
    }
}