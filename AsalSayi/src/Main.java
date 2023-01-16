public class Main {
    public static void main(String[] args) {
        boolean asalMi = false;
        for(int i=2; i<=100; i++) {
            asalMi = true;
            for(int sayi = 2; sayi<i; sayi++) {
                if(i == 2) {
                    asalMi = true;
                }
                else if(i%sayi == 0) {
                    asalMi = false;
                    break;
                }
            }
            if(asalMi == true) {
                System.out.println(i);
            }
        }
    }
}