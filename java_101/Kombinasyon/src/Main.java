import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int r;
        int i;
        int nFakt = 1;
        int rFakt = 1;
        int nrFakt = 1;
        int nrCombinasyon = 1;
        System.out.println("n sayısını girniz:");
        n = input.nextInt();
        System.out.println("r sayısını giriniz:");
        r = input.nextInt();
        for(i=1; i<=n; i++) {
            nFakt *= i;
        }

        for(i=1; i<=r; i++) {
            rFakt *= i;
        }

        for(i=1; i<=(n-r); i++) {
            nrFakt *= i;
        }
        nrCombinasyon = nFakt / (rFakt * (nrFakt));
        System.out.println("C(n,r) = " + nrCombinasyon);
    }
}