import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("a sayısını giriniz");
        a = input.nextInt();
        System.out.println("b sayisini giriniz");
        b = input.nextInt();
        System.out.println("c sayısını giriniz");
        c = input.nextInt();

        if((a>b) && (a>c)) {
            if(b>c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        }

        else if((b>c) && (b>a)) {
            if(a>c) {
                System.out.println("b>a>c");
            } else {
                System.out.println("b>c>a");
            }
        }

        else if((c>b) && (c>a)) {
            if(a>b) {
                System.out.println("c>a>b");
            } else {
                System.out.println("c>b>a");
            }
        }
    }
}