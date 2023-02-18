import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sinir, adet = 0, total = 0;
        System.out.println("Sınır değer giriniz:");
        sinir = input.nextInt();

        for(int i=0; i<=sinir; i++) {
            if((i%3 == 0) && (i%4 == 0)) {
                total +=i;
                System.out.println(i);
                adet++;
            }
        }
        double ort = total / adet;
        System.out.println("0 ile " + sinir + " arasındaki 3 ve 4 e bölünens sayıların ortalaması: " + ort);
    }
}