import java.util.Arrays;
import java.util.Scanner;
public class Main {
    //  PROJE HENÜZ TAMAMLANMADI
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int[] array2 = new int[10];
        int[] array = {15,-45,34,78,23,12,90,6,19};
        int enKucuk = 10000, enBuyuk = -10000;
        int buyukSayi = 0;
        Arrays.sort(array);
        for (int i=0; i<array.length-1; i++) {
            System.out.println(array[i]);
            if(array[i]<=sayi) {
                enKucuk = array[i];
            }
            if(array[i] >= sayi && (array[i] < array[i+1])) {
                array2[i] = array[i];
            }
        }
        Arrays.sort(array2);
        enBuyuk = array2[0];

        System.out.println(enKucuk + " " + enBuyuk);

    }
}