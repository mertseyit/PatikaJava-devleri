import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 10000, islem, hak = 3, tutar;
        boolean cikis = false, islemSonlandir = false, islemDevam = true;
        String kullaniciSifre;
        while (hak != 0 && !islemSonlandir) {
            System.out.println("Şifrenizi giriniz:");
            kullaniciSifre = input.next();
            if(!kullaniciSifre.equals("1234")) {
                System.out.println("Şifrenizi hatalı girdiniz. Kalan hakkınız: " + hak);
                hak--;
                if(hak == 0) {
                    System.out.println("Hakkınız tükendi. Şifre bloke edildi. Lütfen bankamız ile iletişime geçiniz !");
                }
            } else {
                while (islemDevam) {
                    System.out.println("yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Para çekmek\n2-Para Yatırmak\n3-Bakiye Sorgulamak");
                    islem = input.nextInt();
                    cikis = false;
                    switch (islem) {
                        case 1:
                        {
                            while (!cikis) {
                                System.out.println("Mevcut bakiye: " + total);
                                System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
                                tutar = input.nextInt();
                                if(tutar<0) {
                                    System.out.println("Hatalı tutar girdiniz !");
                                }
                                else if(tutar>total) {
                                    System.out.println("Yetersi bakiye");
                                }
                                else {
                                    total = total - tutar;
                                    int yonlendirme = 0;
                                    System.out.println(tutar + "Miktarında para çektiniz. Kalan bakşyeniz" + total);
                                    System.out.println("Başka işlem yapmak istiyor musunuz: Evet ise 1 Hayır ise 2");
                                    yonlendirme = input.nextInt();
                                    if(yonlendirme == 1) {
                                        System.out.println("Ana sayfaya yönlediriliyorsunuz...");
                                        cikis = true;
                                    } else {
                                        System.out.println("İyi günler dileriz");
                                        cikis = true;
                                        islemSonlandir = true;
                                    }
                                }
                            }
                        }
                        break;
                        case 2:
                        {
                            while (!cikis) {
                                System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                                int yatirmaTutari = input.nextInt();
                                if(yatirmaTutari<0) {
                                    System.out.println("Hatalı bakiye girdiniz. Lütfen tekrar deneyiniz.");
                                } else {
                                    total += yatirmaTutari;
                                    System.out.println("Yatırma işleminiz başarı ile gerçekleşmiştir");
                                    System.out.println("Başka işlem yapmak istiyor musunuz: Evet ise 1 Hayır ise 2 tuşlayınız");
                                    int yonlendirme = input.nextInt();
                                    if(yonlendirme == 1) {
                                        System.out.println("Ans sayfaya yönlendirirliyorsunuz...");
                                        cikis = true;
                                    } else {
                                        System.out.println("İyi günler dileriz");
                                        cikis = true;
                                        islemSonlandir = true;
                                    }
                                }
                            }
                        }
                        break;
                        case 3:
                        {
                            System.out.println("Güncel Bakiyeniz: " + total);
                            System.out.println("Başka işlem yapmak istiyor musunuz ? Evet ise 1 Hayır ise 2 tuşlayınız");
                            int yonlendirme = input.nextInt();
                            if(yonlendirme == 1) {
                                System.out.println("Ans sayfaya yönlendirirliyorsunuz...");
                            } else {
                                System.out.println("İyi günler dileriz");
                                islemSonlandir = true;
                            }
                        }
                        break;
                    }
                    if(islemSonlandir) {
                        islemDevam = false;
                    }
                }
            }
        }
    }
}