import java.util.Scanner;

public class Main {
    public static double addition(double a,double b){
        return a+b;
    }
    public static double Soustraction(double a,double b){
        return a-b;
    }
    public static double Multiplication(double a,double b){
        return a*b;
    }
    public static double Division(double a,double b){
        if (b==0) {
            System.out.println("erreur:dividion par zero");
            return 0;}else {
            return a / b;
        }
    }
    public static double  Puissance(double a,double b){
        return Math.pow(a,b);
    }
    public static double Racine_carree(double a,double b){
        if (a<0){
            System.out.println("Erreur: Racine carrée d'un nombre négatif !");
            return -1;
        }else {
            return Math.sqrt(a);
        }
    }
    public static long factorielle(int n){
        if (n < 0) {
            System.out.println("Erreur: Factorielle d'un nombre négatif !");
            return -1;
        }
        long fact=1;
        for (int i=1;i<=n;i++){
            fact *=i;
        }
      return fact;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("----------------Menu Calculatrice----------------");
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
            if (choix==0){
                System.out.println("Programme terminé.");
                break;
            }
            double num1,num2;
            switch (choix){
                case 1:
                    System.out.println("Entrez le premier nombre:");
                    num1=scanner.nextDouble();
                    System.out.println("Entrez le deuxième nombre:");
                    num2=scanner.nextDouble();
                    System.out.println("Résultat: "+ addition(num1,num2));
                    break;
            }

        }

    }
}
