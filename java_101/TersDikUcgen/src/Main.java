import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz:");
        int n = input.nextInt();
        //girilecek değer yer alacak
        for (int i = n; i >0; i--) {

            for (int j = 0; j <=n - i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k < n + i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}