import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz= 0.95;
        double patlican = 5.00;
        int armutKilo;
        int elmaKilo;
        int domatesKilo;
        int muzKilo;
        int patlicanKilo;
        double total = 0;
        System.out.println("Kac kilo armut:");
        armutKilo = input.nextInt();
        System.out.println("Kac kilo elma:");
        elmaKilo = input.nextInt();
        System.out.println("Kac kilo domates:");
        domatesKilo = input.nextInt();
        System.out.println("Kac kilo muz:");
        muzKilo = input.nextInt();
        System.out.println("Kac kilo patlıcan:");
        patlicanKilo = input.nextInt();
        total = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * domates) + (muzKilo * muz) + (patlicanKilo * patlican);
        System.out.println("Totalde Odemeniz gereken tutar: " + total);
    }
}