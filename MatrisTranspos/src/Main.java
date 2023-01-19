import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matris = new int[3][4];
        int[][] transpoz = new int[4][3];
        System.out.println("Matris:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                matris[i][j] = 1 + i;
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpoz:");
        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                transpoz[i][j] = matris[j][i];
                System.out.print(transpoz[i][j]);
            }
            System.out.println();
        }

    }
}