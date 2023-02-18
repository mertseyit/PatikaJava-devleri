import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {5,4,7,3,5,8,5,2,9,13,5,2};
        Arrays.sort(dizi);
        int[] freq = new int[dizi[dizi.length-1] + 1];

        for(int i=0; i<dizi.length; i++) {
            freq[dizi[i]] += 1;
        }

        System.out.println(Arrays.toString(freq));
        for(int j=0; j<freq.length; j++) {
            if(freq[j] != 0) {
                System.out.println((j) + " elemanından " + freq[j] + " tane var");
            }
        }
    }
}