package fr.uvsq.poo.compte;


public enum calculatriceRPN {

    ENVIRONNEMENT;

    public void run( String[] args) {
        SaisieRPN saisie = new SaisieRPN();
        saisie.saisie();
    }

    public static void main( String[] args ) {
        ENVIRONNEMENT.run(args);

    }
}
