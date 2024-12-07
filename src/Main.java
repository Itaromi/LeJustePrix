import java.util.Scanner;

public class Main {

    public static int genererChiffre() {
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        return (int) (Math.random() * range + min);
    }

    public static void jouer() {
        System.out.println("J'ai réfléchi et je te laisse trouver mon nombre !");
        int nombreAleatoire = genererChiffre();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Tapez un nombre ou 'quit' pour abandonner :");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Merci d'avoir joué ! Le nombre était " + nombreAleatoire);
                break;
            }

            try {
                int nombre = Integer.parseInt(input);

                if (nombre > nombreAleatoire) {
                    System.out.println("Moins !");
                } else if (nombre < nombreAleatoire) {
                    System.out.println("Plus !");
                } else {
                    System.out.println("GG, tu as trouvé le nombre !");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'quit'.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        jouer();
    }
}
