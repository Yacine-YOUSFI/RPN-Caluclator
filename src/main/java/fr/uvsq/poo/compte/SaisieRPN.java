package fr.uvsq.poo.compte;

import java.util.Scanner;
import java.util.Scanner;

public class SaisieRPN {
    private MoteurRPN moteur;
    private Scanner sc;


    public SaisieRPN(){
        moteur = new MoteurRPN();
    }


    public void setScanner(Scanner sc) {
        this.sc = sc;
    }


    public void closeScanner() {
        sc.close();
    }


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


    public String scanneLigne()  {
        String input;
        if (sc.hasNextDouble()) {
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
            }
            else if (isOperation(input)) {
                moteur.excuterOperations(renvoieOperation(input));
            }

        }
        return input;
    }
    private boolean isOperation(String str) {
        return this.renvoieOperation(str) != null;
    }
    private Operations renvoieOperation(String string) {
        for (Operations op : Operations.values())
            if (string.charAt(0) == op.getOperande())
                return op;
        return null;

    }


}

