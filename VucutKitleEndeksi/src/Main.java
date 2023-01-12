import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy;
        int kilo;
        double index;
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        kilo = input.nextInt();
        index = kilo / (boy * boy);
        System.out.println("Vücut kitle index'iniz: " + index);
    }
}