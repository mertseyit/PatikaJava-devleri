public class Main {
    static int i = 1;
    //BU PROJE HENÜZ TAMAMLANMADI

    static int desen(int sayi, int same) {
        System.out.println(sayi);
        if(sayi == same && i == 2) {;
            return 1;
        } else {
            if(sayi>0 && i == 2) {
                i = 2;
                return desen(sayi-5, same);
            }
            else if(sayi<0 && i == 2) {
                i = 3;
                return desen(sayi + 5, same);
            }
            else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        desen(16,16);
    }
}