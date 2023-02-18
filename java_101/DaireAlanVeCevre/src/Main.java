import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        double merkezAci = 0;
        double r = 0;
        double alan = 0;
        double cevre = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Daire diliminin yarı çapını giriniz:");
        r = input.nextDouble();
        System.out.println("Daire diliminin mewkez acısını giriniz:");
        merkezAci = input.nextDouble();
        alan = (pi*(r*r)*merkezAci) / 360;
        cevre = 2 * pi * r;
        System.out.println("Daire diliminin Alanı: " + alan + "\n" + "Daire diliminin cevresi: " + cevre);


    }
}