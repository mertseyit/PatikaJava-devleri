import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bölüm = -1;
        int sinir;
        boolean controll1 = true, controll2 = true;
        int iDeger = -1;
        System.out.println("Sınır değeri girini:");
        sinir = input.nextInt();
        System.out.println("0 ile" + sinir + " değerleri arasındaki sayılardan:");
        System.out.println("4'ün katları:");
        for(int i=1; i<sinir; i++) {
            controll1 = true;
            if((i%4 == 0)) {
                iDeger = i;
                while(controll1) {
                    bölüm = iDeger / 4;
                    if(bölüm%4 != 0) {
                        controll1 = false;
                    }

                    if(bölüm == 1) {
                        System.out.println(i);
                        controll1 = false;
                    }
                    iDeger = bölüm;
                }
            }
        }
        System.out.println("5'ün katları:");
        for(int i=1; i<sinir; i++) {
            controll2 = true;
            if((i%5 == 0)) {
                iDeger = i;
                while(controll2) {
                    bölüm = iDeger / 5;
                    if(bölüm%5 != 0) {
                        controll2 = false;
                    }

                    if(bölüm == 1) {
                        System.out.println(i);
                        controll2 = false;
                    }
                    iDeger = bölüm;
                }
            }
        }


    }
}