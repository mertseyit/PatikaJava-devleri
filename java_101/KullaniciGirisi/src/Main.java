import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, userPassword;
        System.out.println("Kullanıcı adınızı giriniz:");
        userName = input.next();
        System.out.println("Şifrenizi giriniz:");
        userPassword = input.next();
        int isWantChange = -1;

        if(userName.equals("patika") && userPassword.equals("patika123")) {
            System.out.println("Hoş geldin " + userName);
        }
        else if(userPassword.equals("patika123") && !userName.equals("patika")) {
            System.out.println("Kullanıcı adınız yanlış");
        }
        else if(userName.equals("patika") && !userPassword.equals("patika123")) {
            System.out.println("Şifreniz hatalı. Eğer şifrenizi hatırlamıyorsanız sıfırlayabilirsiniz\nSıfırlamak için 1 e, tekrar denemek için 2 ye basınız");
            isWantChange = input.nextInt();
            if (isWantChange == 1) {
                String newUserPassword = "";
                System.out.println("Lutfen oluşturmak istediğiniz şifreyi giriniz:");
                newUserPassword = input.next();
                if (newUserPassword.equals("patika123")) {
                    System.out.println("Şifreniz eski şifre ile aynı ! siz bir yalancısınız ve sistemden atıldınız! BB");
                } else {
                    System.out.println("Yeni şifreniz başarı ile kaydedildi. İşlemlere tekrar başlamak için lütfen uygulamayı yeniden başlatin !");
                }
            } else {
                System.out.println("Hatalı tuşa bastınız. Lütfen uygulamaya tekrar giriş yapınız !");
            }
        }
    }
}