public class Main {
    public static void main(String[] args) {
        String[][] desen = new String[7][5];
        for(int i=0; i<7; i++) {
            for(int j=0; j<5; j++) {
                //işlemler
                if(i == 0 || i == 3 || i == 6) {
                    desen[i][j] = "*";
                }

                else if(j == 0 || j == 4) {
                    desen[i][j] = "*";
                } else {
                    desen[i][j] = " ";
                }
            }
        }

        for(String[] row: desen) {
            for(String col: row) {
                System.out.print(col + " " );
            }
            System.out.println();
        }
    }
}