package hitema.java;

import hitema.java.jeu.Jeu;

import static hitema.java.jeu.Jeu.demanderTaille;


public class MainConsole {
    public static void main(String[] args) {
        int taille = demanderTaille();
        Jeu jeu = new Jeu(taille);
        jeu.lancer();
    }
}



