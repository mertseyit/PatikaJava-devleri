import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.println("Yıl Giriniz:");
        yil = input.nextInt();
        if(yil % 4 == 0) {
            if(yil % 100 == 0) {
                if(yil%400 == 0) {
                    System.out.println(yil + " yili bir artık yıldır");
                } else {
                    System.out.println(yil + " yili artık yıl değildir");
                }
            } else {
                System.out.println(yil + " yili bir artık yıldır");
            }
        } else {
            System.out.println(yil + " yili bir artık yıl değildir son");
        }
    }
}