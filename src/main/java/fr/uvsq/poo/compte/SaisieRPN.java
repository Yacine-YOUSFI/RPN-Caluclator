package fr.uvsq.poo.compte;

import fr.uvsq.poo.compte.exception.ErreurSaisiExeption;

import java.util.Scanner;

/**
 * @author RAHMANI NADJIB
 * @class SaisieRPN qui prend en charge les operands , operations et commandes entré par l'user
 */
public class SaisieRPN {
    private MoteurRPN moteur;
    private Scanner sc;

    /**
     * Constructeur de la classe
     */
    public SaisieRPN(){
        moteur = new MoteurRPN();
    }

    /**
     * Initialise le Scanner (l'entre)
     * @param sc instance de Scanner de java
     */
    public void setScanner(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Ferme le Scanner
     */
    public void closeScanner() {
        sc.close();
    }

    /**
     * Fonction pour la saisie par le user
     * Appelée des l'execution de programme
     */
    public void saisie() {
        this.setScanner(new Scanner(System.in));

        String input = "";
        String str = "";

        while(moteur.isOn()) {
            System.out.println("Saisir un entier, une opération,undo ou exit pour sortir");
            try {
                input = scanneLigne();
                str += input + " ";
                System.out.println(str);
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }
            System.out.println(moteur.afficherPile());
        }


        System.out.println("Fin ");
        this.closeScanner();
    }

    /**
     * Scanne une ligne et savoir son type si operande,operation,undo ou exit
     * @return ce qui est entree
     */
    public String scanneLigne()  {
        String input;
        if (sc.hasNextInt()) {
            Integer d = sc.nextInt();
            moteur.enregistrerNombreCommande(d);
            sc.nextLine();
            input = d.toString();
        }
        else {
            input = sc.nextLine();
            if (input.equals("exit")) {
                moteur.shutdown();
            }
            else if (input.equals("undo")) {
                moteur.undo();
            }
            else if (isOperation(input)) {
                moteur.excuterOperations(renvoieOperation(input));
            }
            else {
                throw new ErreurSaisiExeption();
            }

        }
        return input;
    }
    /**
     * Methode pour savoir si l'entree de user est une operation
     * @param str l'entree
     * @return booléen
     */
    private boolean isOperation(String str) {
        return this.renvoieOperation(str) != null;
    }
    /**
     * Retourne une opération correspondant au string entree
     * @param str
     * @return Opération
     */
    private Operations renvoieOperation(String string) {
        for (Operations op : Operations.values())
            if (string.charAt(0) == op.getOperande())
                return op;
        return null;

    }


}

