import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        double sonuc = 0;

        System.out.println("Sayi 1 giriniz:");
        sayi1 = input.nextInt();
        System.out.println("Sayi 2 giriniz:");
        sayi2 = input.nextInt();
        System.out.println("İşlem giriniz: \n + - * /");
        String islem = input.next();

        switch (islem) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "/":
                sonuc = (double)sayi1 / sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "":
                System.out.println("işlem yapmadınız !");
                break;
        }
        System.out.println("SONUC: " + sonuc);


    }
}