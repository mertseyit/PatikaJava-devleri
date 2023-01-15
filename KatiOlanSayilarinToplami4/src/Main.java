import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır giriniz:");
        int sinir = input.nextInt();
        int total = 0;

        for(int i=0; i<=sinir; i++) {
            if((i%2 == 0) && (i%4 == 0)) {
                total += i;
                System.out.println(i);
            }
        }

        System.out.println("0 ile " + sinir + " arasındaki çift ve 4'ün kati olan sayıların toplamı: " + total);

    }
}