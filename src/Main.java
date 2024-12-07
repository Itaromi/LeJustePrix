/*
Objectif du jeu :
L'ordinateur génère un nombre aléatoire entre 1 et 100.
L'utilisateur doit deviner ce nombre.
À chaque tentative, le programme indique si le nombre à deviner est plus grand ou plus petit.
Le jeu se termine lorsque l'utilisateur trouve le bon nombre ou tape "quit" pour abandonner.

*/

public class Main {

    public static int genererChiffre() {
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        return (int) (Math.random() * range + min);
    }

    public static void main(String[] args) {
        System.out.println(genererChiffre());
    }
}