import java.util.Scanner;

public class MayinOyunu {
    int row;
    int col;
    int kazandiMi = 0;
    String[][] oyun = new String[4][3];
    String[][] ekran = new String[4][3]; // tüm değerler -
    public MayinOyunu() {
        this.row = row;
        this.col = col;
        //mayınlar
        this.oyun[0][0] = "*";
        this.oyun[3][0] = "*";
        this.oyun[1][2] = "*";

        for(int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                if(this.oyun[i][j] != "*") {
                    this.oyun[i][j] = " ";
                }
                this.ekran[i][j] = "-";
            }
        }
    }
    public void play() {
        int mayinSayisi = 0;
        boolean exit = false;
        while(!exit) {
            Scanner input = new Scanner(System.in);
            System.out.println("Satır:");
            this.row = input.nextInt();
            System.out.println("Sütun:");
            this.col = input.nextInt();
            if(controll()) {
                if(oyun[this.row][this.col] == "*") {
                    //oyun bitti
                    System.out.println("MAYINA BASTINIZ");
                    exit = true;
                } else {
                    if(sagKontrol()) {
                        mayinSayisi++;
                    }
                    if(solKontrol()) {
                        mayinSayisi++;
                    }
                    if(altKontrol()) {
                        mayinSayisi++;
                    }
                    if(ustKontrol()) {
                        mayinSayisi++;
                    }
                    if(solUstKontrol()) {
                        mayinSayisi++;
                    }
                    if(solAltKontrol()) {
                        mayinSayisi++;
                    }
                    if(sagUstKontrol()) {
                        mayinSayisi++;
                    }
                    if(sagAltKontrol()) {
                        mayinSayisi++;
                    }
                    this.ekran[this.row][this.col] = String.valueOf(mayinSayisi);
                    for(int i=0; i<4; i++) {
                        for (int j=0; j<3; j++) {
                            System.out.print(ekran[i][j] + " ");
                        }
                        System.out.println();
                    }
                    this.kazandiMi++;
                    if(kazandiMi == 9) {
                        System.out.println("OYUNU KAZANDINIZ !");
                        exit = true;
                    }
                    mayinSayisi = 0;
                }
            } else {
                System.out.println("Hatalı veri girişi");
            }
        }
    }

    public boolean controll() {
        if(this.row >=4 || this.row<0 || this.col>=3 || this.col<0) {
            //hatalı veri girişi var
            return false;
        } else {
            return true;
        }
    }

    //ekrana oyun durumunu yazdıran bir method
    public boolean sagKontrol() {
       if(this.col + 1 >= 3) {
           return false;
       } else {
           if(oyun[this.row][this.col+1] == "*")
               return true;
           else
               return false;
       }
    }

    public boolean solKontrol() {
        if(this.col - 1 < 0) {
            return false;
        } else {
            if(oyun[this.row][this.col-1] == "*")
                return true;
            else
                return false;
        }
    }

    public boolean ustKontrol() {
        if(this.row - 1 < 0) {
            return false;
        } else {
            if(oyun[row-1][col] == "*") {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean altKontrol() {
        if(this.row + 1 >= 4) {
            return false;
        } else {
            if(oyun[this.row + 1][col] == "*") {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean sagUstKontrol() {
        if(this.row-1 < 0 || this.col + 1>=3) {
            return false;
        } else {
            if(oyun[this.row -1][this.col + 1] == "*") {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean solUstKontrol() {
        if(this.row - 1 < 0 || this.col - 1 < 0) {
            return false;
        } else {
            if(this.oyun[this.row - 1][this.col - 1] == "*") {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean sagAltKontrol() {
        if(this.col + 1 >=3 || this.row + 1 >= 4) {
            return false;
        } else {
            if(this.oyun[this.row + 1][this.col + 1] == "*") {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean solAltKontrol() {
        if(this.col - 1 < 0 || this.row + 1 >= 4) {
            return false;
        } else {
            if(this.oyun[this.row + 1][this.col - 1] == "*") {
                return true;
            } else {
                return false;
            }
        }
    }

}
