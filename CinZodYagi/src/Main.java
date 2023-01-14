import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili;
        String burc = "";
        System.out.println("Dogum Yilinizi giriniz");
        dogumYili = input.nextInt();
        if(dogumYili % 12 == 0) {
            burc = "Maymun";
        }
        else if(dogumYili % 12 == 1) {
            burc = "Horoz";
        }
        else if(dogumYili % 12 == 2) {
            burc = "Köpek";
        }
        else if(dogumYili % 12 == 3) {
            burc = "Domuz";
        }
        else if(dogumYili % 12 == 4) {
            burc = "Fare";
        }
        else if(dogumYili % 12 == 5) {
            burc = "Öküz";
        }
        else if(dogumYili % 12 == 6) {
            burc = "Kaplan";
        }
        else if(dogumYili % 12 == 7) {
            burc = "Tavşan";
        }
        else if(dogumYili % 12 == 8) {
            burc = "Ejderha";
        }
        else if(dogumYili % 12 == 9) {
            burc = "Yılan";
        }
        else if(dogumYili % 12 == 10) {
            burc = "At";
        }
        else if(dogumYili % 12 == 11) {
            burc = "Koyun";
        }

        System.out.println("Çin Zod Yağı yılına göre burcunuz: " + burc);
    }
}