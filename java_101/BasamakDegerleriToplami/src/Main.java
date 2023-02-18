import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi = input.nextInt();
        int tempSayi = sayi, a = -1;
        int ten = 10;
        int basamakDegeri = 0;
        int basamakSayisi = 0, basamakToplam = 0;
        //basamak buldurma, sayı kaç basamaklı ?
        while (a!=0) {
            a = tempSayi / 10;
            tempSayi = a;
            basamakSayisi++;
        }
        tempSayi = sayi;
        // basamaklarına ayırma
        for(int i=1; i<=basamakSayisi; i++) {
            basamakDegeri = tempSayi % ten;
            tempSayi = tempSayi - basamakDegeri;
            tempSayi = tempSayi / 10;
            basamakToplam += basamakDegeri;
        }

        System.out.println(sayi + " sayısının basamakları toplamı: " + basamakToplam);
    }
}