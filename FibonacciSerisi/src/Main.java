import java.net.SecureCacheResponse;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci seriniz kaça kadar olsun:");
        int sinir = input.nextInt();
        int b = 0;
        int a = 0;
        int result = 1;
        for(int i=0; i<=sinir; i++) {
            System.out.println(result);
            a = b;
            b = result;
            result = a + b;
        }
    }
}