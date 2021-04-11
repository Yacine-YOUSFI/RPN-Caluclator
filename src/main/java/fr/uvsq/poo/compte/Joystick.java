package fr.uvsq.poo.compte;
/**
 * @author RAHMANI NADJIB
 * @class Savoir si la calcul est ouvert ou ferme
 */
public class Joystick {
    private boolean key;
    /**
     * Constrecteur de la classe
     */
    public Joystick() {
        this.key = true;
    }
    /**
     * Methode pour savoir si la calculatrice on
     * @return booléen
     */
    public boolean isOn() {
        return key;
    }
    /**
     * Methode pour mettre la calculatrice off
     * @return booléen
     */
    public boolean turnOff() {
        key = false;
        return key;
    }
}