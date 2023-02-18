import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ust, alt, total = 1;
        System.out.println("Ussu alınacak sayıyı giriniz:");
        alt = input.nextInt();
        System.out.println("Us değerini giriniz:");
        ust = input.nextInt();
        for(int i =1; i<=ust; i++) {
            total *= alt;
        }

        System.out.println(alt + "^" + ust + " : " + total);
    }
}