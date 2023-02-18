import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        for(int i=0; i<=counter;i++) {
            try {
                long data = input.nextLong();
                System.out.println(data +" can be fitted in:");
                if(data >=-128 && data<=127) {
                    System.out.println("* byte");
                }
                if(data >= -32768 && data<=32767) {
                    System.out.println("* short");
                }
                if(data >= -2147483648 && data<=2147483647) {
                    System.out.println("* int");
                }
                if(data >= -2147483648 && data <= 2147483647) {
                    System.out.println("* long");
                }
                else {
                    System.out.println("can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println("can't be fitted anywhere.");
            }
        }
    }
}