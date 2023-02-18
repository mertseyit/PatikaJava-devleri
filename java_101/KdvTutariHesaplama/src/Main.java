import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tutar;
        double kdvTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutar giriniz");
        tutar = input.nextInt();
        kdvTutar = tutar<1000 ? 0.18 : 0.08;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV'li tutar: " + (tutar * kdvTutar + tutar));
        System.out.println("KDV oranı: " + kdvTutar);
    }
}