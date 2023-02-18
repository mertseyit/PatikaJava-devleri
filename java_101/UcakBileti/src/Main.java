import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yolculukTipi;
        double fiyat = 0;
        int yas = 0;
        System.out.println("Gidilecek Mesafeyi Giriniz:");
        mesafe = input.nextInt();
        System.out.println("Yaş Giriniz:");
        yas = input.nextInt();
        System.out.println("Sadece gidiş ise 1 gidiş-dönüş ise 2 seçiniz");
        yolculukTipi = input.nextInt();

        if(mesafe>=1) {
            fiyat = (mesafe * 0.10);
            if(yolculukTipi != 1 && yolculukTipi != 2) {
                System.out.println("Yolculuk tipinş yanlış tuşladınız");
            } else {
                //işlem bloklarım
                if(yas < 12) {
                    fiyat = fiyat - (fiyat * 0.5);
                }

                if(yas>=12 && yas<=24) {
                    fiyat = fiyat - (fiyat * 0.1);
                }

                if(yas >= 65) {
                    fiyat = fiyat - (fiyat * 0.3);
                }
                if(yolculukTipi == 2) {
                    //en son işlesin
                    fiyat = fiyat - (fiyat * 0.2);
                }
                System.out.println("Total bilet fiyatınız: " + fiyat);
            }
        } else {
            System.out.println("Mesafe 1 den az olamaz !");
        }


    }
}