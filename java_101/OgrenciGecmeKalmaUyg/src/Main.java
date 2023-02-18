import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,muzik,kimya,turkce,fizik, ort = 0;
        int ortalamyaKatilacakDersSayisi = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("100 üstündeki ve 0'ın altındaki notlar ortalamaya etki etmeyecektir !");
        System.out.println("Ogrencinin mat notunu giriniz");
        mat = input.nextDouble();
        System.out.println("Ogrencinin muzik notunu giriniz");
        muzik = input.nextDouble();
        System.out.println("Ogrencinin kimya notunu giriniz");
        kimya = input.nextDouble();
        System.out.println("Ogrencinin türkçe notunu giriniz");
        turkce = input.nextDouble();
        System.out.println("Ogrencinin fizik notunu giriniz");
        fizik = input.nextDouble();
        double total = (mat+muzik+kimya+turkce+fizik);

        if(mat<0 || mat>100) {
            total -= mat;
            ortalamyaKatilacakDersSayisi--;
        }
        if(muzik<0 || muzik>100) {
            total -= muzik;
            ortalamyaKatilacakDersSayisi--;
        }
        if(kimya<0 || kimya>100) {
            total -= kimya;
            ortalamyaKatilacakDersSayisi--;
        }
        if(turkce<0 || turkce>100) {
            total -= turkce;
            ortalamyaKatilacakDersSayisi--;
        }
        if((fizik<0 || fizik>100)) {
            total -= fizik;
            ortalamyaKatilacakDersSayisi--;
        }
        System.out.println(total);
        if(total == 0) {
            System.out.println("Ogrencini tum notlarını hatalı girdiniz. Lütfen gözlük takınız");
        } else {
            ort = total / ortalamyaKatilacakDersSayisi;
            System.out.println("Ogrencinin ortalası: " + ort);
            if(ort<55) {
                System.out.println("Ogrenci sınıfta kaldı, seneye artık :)");
            } else {
                System.out.println("Ogrenci sınıfı geçti, tebrikler :)");
            }
        }
    }
}