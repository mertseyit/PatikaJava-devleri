import java.util.Scanner;
public class Main {
    static int pow(int sayi, int us) {
        if(us == 0) {
            return 1;
        }
        return sayi * pow(sayi, us - 1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,0));
    }
}