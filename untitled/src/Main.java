import java.util.Scanner;
public class Main {
    public static double addition(double a, double b) {
        return a + b;
    }
    public static double soustraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        Scanner sc = new Scanner(System.in);
        while(b == 0) {
            System.out.println("Erreur: Division par zéro !");
            b = sc.nextDouble();
        }
        return a / b;
        
    }
    public static double puissance(double a, double b) {
        return Math.pow(a, b);
    }
    public static double racineCarree(double a) {
        Scanner sc =new Scanner(System.in);
        while (a <= 0) {
            System.out.println("Erreur: Vous devez entrer un nombre positif supérieur à 0 !");
            a = sc.nextDouble();
        }
        return Math.sqrt(a);
    }
    public static long factorielle(int n) {
        Scanner sc =new Scanner(System.in);
        while (n<0) {
            System.out.println("Erreur: Vous devez entrer un nombre positif !");
            n = sc.nextInt();
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------ Menu Calculatrice ------");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Puissance");
            System.out.println("6. Racine carrée");
            System.out.println("7. Factorielle");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            if (choix == 0) {
                System.out.println("Programme terminé.");
                break;
            }
            double num1, num2;
            switch (choix) {
                case 1:
                    System.out.print("Entrez le premier nombre: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Entrez le deuxième nombre: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Résultat: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.print("Entrez le premier nombre: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Entrez le deuxième nombre: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Résultat: " + soustraction(num1, num2));
                    break;
                case 3:
                    System.out.print("Entrez le premier nombre: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Entrez le deuxième nombre: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Résultat: " + multiplication(num1, num2));
                    break;
                case 4:
                    System.out.print("Entrez le premier nombre: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Entrez le deuxième nombre: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Résultat: " + division(num1, num2));
                    break;
                case 5:
                    System.out.print("Entrez la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Entrez l'exposant: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Résultat: " + puissance(num1, num2));
                    break;
                case 6:
                    System.out.print("Entrez le nombre: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Résultat: " + racineCarree(num1));
                    break;
                case 7:
                    System.out.print("Entrez un entier pour calculer sa factorielle: ");
                    int n = scanner.nextInt();
                    System.out.println("Résultat: " + factorielle(n));
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
