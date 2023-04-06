package hitema.java.plateau;

import hitema.java.jeu.Jeu;

public class Plateau {
    private char[][] grille;

    public Plateau() {
        grille = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grille[i][j] = '-';
            }
        }
    }

    public void afficher() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placer(int x, int y, char symbole) {
        if (x < 0 || x >= 3 || y < 0 || y >= 3 || grille[x][y] != '-') {
            return false;
        }
        grille[x][y] = symbole;
        return true;
    }

    public boolean verifierVictoire(char symbole) {
        for (int i = 0; i < 3; i++) {
            if (grille[i][0] == symbole && grille[i][1] == symbole && grille[i][2] == symbole) {
                return true;
            }
            if (grille[0][i] == symbole && grille[1][i] == symbole && grille[2][i] == symbole) {
                return true;
            }
        }
        if (grille[0][0] == symbole && grille[1][1] == symbole && grille[2][2] == symbole) {
            return true;
        }
        if (grille[0][2] == symbole && grille[1][1] == symbole && grille[2][0] == symbole) {
            return true;

        }
        return false;
    }

    public boolean estPlein() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grille[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}