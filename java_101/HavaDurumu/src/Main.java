import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int havaTahmin;
        System.out.println("Sıcaklık giriniz");
        havaTahmin = input.nextInt();
        if(havaTahmin<5) {
            System.out.println("Kayak yapmaya gidebilirsin !");
        }

        else if( havaTahmin>=5 && havaTahmin<15) {
            System.out.println("Sinemaya gidebilirsin");
        }

        else if(havaTahmin>=15 && havaTahmin<25) {
            System.out.println("Piknik yapmaya gidebilirsin");
        }

        else if(havaTahmin>=25) {
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}