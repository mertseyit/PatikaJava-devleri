import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz:");
        int adet = input.nextByte();
        int sayi, temp1, temp2 = -1, enBuyuk = -100000, enKucuk = 1000000;

        for(int i=1; i<=adet; i++) {
            System.out.println(i + ". sayıyı giriniz");
            sayi = input.nextInt();
            temp1 = sayi;
            if(sayi>enBuyuk) {
                enBuyuk = sayi;
            }

            if(sayi<enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("En Büyük:" +enBuyuk + "\nEn Küçüük: " + enKucuk);
    }
}