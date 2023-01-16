import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int toplam = 0;
        for(int i = 1; i<sayi; i++) {
            if(sayi%i == 0) {
                toplam += i;
            }
        }
        if(sayi%toplam == 0) {
            System.out.println(sayi + " sayısı bir mükemmel sayıdır");
        } else {
            System.out.println(sayi + " sayısı bir mükemmel sayı değildir");
        }
    }
}