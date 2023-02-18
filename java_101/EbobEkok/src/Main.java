import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("1. sayıyı giriniz:");
        sayi1 = input.nextInt();
        System.out.println("2. sayıyı giriniz:");
        sayi2 = input.nextInt();
        boolean control = true, control2 = true;
        int sayac = 1;
        int ebob = -1, ekok = -1;
        while (control) {
            //ebob bulma
            if((sayi1%sayac == 0) && (sayi2%sayac == 0)) {
                ebob = sayac;
            }

            if(sayac == sayi1 || sayi2 == sayac) {
                control = false;
                ekok = (sayi1 * sayi2) / ebob;
            }
            sayac++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}