import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,muzik,kimya,turkce,tarih,fizik;
        Scanner input = new Scanner(System.in);
        System.out.println("Ogrencini mat notunu giriniz");
        mat = input.nextDouble();
        System.out.println("Ogrencini muzik notunu giriniz");
        muzik = input.nextDouble();
        System.out.println("Ogrencini kimya notunu giriniz");
        kimya = input.nextDouble();
        System.out.println("Ogrencini türkçe notunu giriniz");
        turkce = input.nextDouble();
        System.out.println("Ogrencini tarih notunu giriniz");
        tarih = input.nextDouble();
        System.out.println("Ogrencini fizik notunu giriniz");
        fizik = input.nextDouble();

        double ort = (mat+muzik+kimya+turkce+tarih+fizik)/6;
        System.out.println("Ogrencinin Not Ortalaması: " + ort);

        String gectiMi = ort<60 ? "KALDI" : "GEÇTİ";
        System.out.println(gectiMi);
    }
}