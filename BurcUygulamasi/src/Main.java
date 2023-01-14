import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;
        System.out.println("Doğduğunuz ayı giriniz:");
        month = input.nextInt();
        System.out.println("Doğduğunuz günü giriniz:");
        day = input.nextInt();
        if(month == 1) { // ocakta doğduysam
            if(day>=1 && day<=31) {
                if (day <= 21) {
                    System.out.println("Oğlak burcusunuz !");
                } else {
                    System.out.println("Koca burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }
        else if(month == 2) {
            if(day>=1 && day<=28) {
                if (day <= 19) {
                    System.out.println("Kova burcusunuz !");
                } else {
                    System.out.println("Balık burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 3  ) {
            if(day>=1 && day<=31) {
                if (day <= 20) {
                    System.out.println("Balık burcusunuz !");
                } else {
                    System.out.println("Koç burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 4 ) {
            if(day>=1 && day<=30) {
                if (day <= 20) {
                    System.out.println("Koç burcusunuz !");
                } else {
                    System.out.println("Boğa burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 5 ) {
            if(day>=1 && day<=31) {
                if (day <= 21) {
                    System.out.println("Boğa burcusunuz !");
                } else {
                    System.out.println("İkizler burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 6 ) {
            if(day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("İkizler burcusunuz !");
                } else {
                    System.out.println("Yengeç burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 7 ) {
            if(day>=1 && day<=32) {
                if (day <= 22) {
                    System.out.println("Yengeç burcusunuz !");
                } else {
                    System.out.println("Aslan  burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 8 ) {
            if(day>=1 && day<=32) {
                if (day <= 22) {
                    System.out.println("Aslan burcusunuz !");
                } else {
                    System.out.println("Başak  burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 9 ) {
            if(day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("Başak burcusunuz !");
                } else {
                    System.out.println("Teraz  burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 10 ) {
            if(day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("Teraz burcusunuz !");
                } else {
                    System.out.println("Akrep  burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 11 ) {
            if(day>=1 && day<=30) {
                if (day <= 21) {
                    System.out.println("Akrep burcusunuz !");
                } else {
                    System.out.println("Yay burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }

        else if(month == 12 ) {
            if(day>=1 && day<=31) {
                if (day <= 21) {
                    System.out.println("Yay burcusunuz !");
                } else {
                    System.out.println("Oğlak burcusunuz");
                }
            } else {
                System.out.println("Olmayan bir gün girdiniz !");
            }
        }
    }
}