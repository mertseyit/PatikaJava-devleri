import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value) {
        for(int i: arr) {
            if(i == value) {
                return true;
            }
        }

        return  false;
    }
    public static void main(String[] args) {
        int[] dizi = {12,12,89,67,45,56,90,34,23,23,90,56,34}; // 20 elemanlı bir dizis
        int[] ciftFrekans = new int[dizi.length];
        int index = 0;
        for(int i=0; i<dizi.length; i++) {
            for(int j=0; j<dizi.length; j++) {
                if((j != i) && (dizi[i] == dizi[j]) && dizi[i]%2 == 0) {
                    if(!isFind(ciftFrekans,dizi[i]))
                        ciftFrekans[index++] = dizi[i];
                    break;
                }
            }
        }

        for(int i: ciftFrekans) {
            if(i != 0) {
                System.out.println(i);
            }
        }
    }
}