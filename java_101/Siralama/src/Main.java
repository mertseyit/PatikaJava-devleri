import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static void sort(int[] dizi) {
        for(int i=0; i<dizi.length; i++) {
            for (int j=0; j < dizi.length; j++) {
                if(dizi[i]<dizi[j]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz:");
        int boyut = input.nextInt();
        int[] dizi = new int[boyut];

        for (int i=0; i<boyut; i++) {
            System.out.println(i+1 + ". Elemanı giriniz:");
            dizi[i] = input.nextInt();
        }

        sort(dizi);

        System.out.println(Arrays.toString(dizi));
    }
}