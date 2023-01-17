import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int tempSayi = sayi;
        int basamakSayisi = 0;
        int basamakDegeri = -1;
        int a = -1;
        int carpim = 1;

        while (a!=0) {
            a = tempSayi / 10;
            tempSayi = a;
            basamakSayisi++;
            carpim *= 10;
        }
        carpim /= 10;
        int palindomSayi = -1;
        tempSayi = sayi;

        for(int i=1; i<=basamakSayisi; i++) {
            basamakDegeri = tempSayi % 10;
            tempSayi -= basamakDegeri;
            tempSayi = tempSayi / 10;
            palindomSayi += carpim * basamakDegeri;
            carpim /= 10;
        }
        out.println(palindomSayi + 1);
        if(sayi == palindomSayi + 1) {
            out.println(sayi + " bir palindrom sayıdır");
        } else {
            out.println(sayi + " bir palindrom sayı değildir");
        }



    }
}