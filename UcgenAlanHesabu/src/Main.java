import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c, cevre = 0;
        double u = 0, alan = 0;

        System.out.println("a kenarini giriniz");
        a = input.nextInt();
        System.out.println("b kenarini giriniz");
        b = input.nextInt();
        System.out.println("c kenarini giriniz");
        c = input.nextInt();
        u = (a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        cevre = (int)(2 * u);
        System.out.println("Ucgenini Alanı: " + alan + "\nUcgenini Cevresi: " + cevre);
    }
}