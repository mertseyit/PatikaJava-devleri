import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz:");
        int N = input.nextInt();
        double harSeri = 0.0;
        for(double i=1; i<=N; i++) {
            harSeri += (1/i);
        }
        System.out.println("harmonik seri: " + harSeri);

    }
}