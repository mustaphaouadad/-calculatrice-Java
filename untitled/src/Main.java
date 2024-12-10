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
        }
    }
    public static void main(String[] args) {


    }
}
