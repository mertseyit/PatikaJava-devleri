import java.util.Scanner;
public class Game {
    private Player player;
    private String userName;
    private Location location;
    private Scanner input = new Scanner(System.in);
    private boolean over = false;
    public void start() {

        System.out.println("Issız bucaksız bir Dünya. 3. Dünya savaşı daha yeni bitmiş." +
                "\nSavaştan aylar önce keşfedilen yeni Galaktikus gezegenine henüz daha sınırlı sayıda insan gönderilmişken Savaşın patlak vermesi nedeni ile " +
                "geride kalan insanların sonu geldi.\nGalaktikus gezegenine gönderilen insanlar dünyada hayatta kalan son insan ile " +
                "temasa sonunda geçebildiler. \n1 hafta sonra dünyaya geri geleceklerini ve geride kalan son canlıyı da kurtaracaklarını bildirmiş durumdalar. " +
                "\n\nBu mesajı alan karakterimizi hayattak tutmak senin görevin. Şavaş alanındaki rakiplerinle savaş ve hayatta kalmak için gerekli olan malzemeleri topla. " +
                "\nUnutma, savaştığın her bir düşmandan topladığın malzemeleri güvenli bölgeye getirmen gerek. Hayatta kal ve kurtul !");
        System.out.println("Oyuna Hoşgeldiniz. İsminizi giriniz");
        this.userName = input.next();
        this.player = new Player(this.userName);
        System.out.println("Oyuna Hoşgeldin " + player.getPlayerName());
        player.selectCharacter();
        while (!this.over) {
            if(player.getIngredients().contains("Odun") && player.getIngredients().contains("Meşale") && player.getIngredients().contains("Mont")) {
                System.out.println(
                        "İşte bu kadar. Galaktikustan ekipler her an gelebilir. Onlar gelene kadar hayatta kalacak malzemelerin var artık.\n" +
                        "Şimdi onların gelmelerini beklerken yaşadığın maceraları bir kağıda yazmaya ne dersin " + this.player.getPlayerName() +
                "\nAyrıca yaşadığın maceralı serüveni de oyun yazarıyla paylaşmayı unutma.... :)\n\nseyityilmaz@7208@gmail.com");
                this.over = true;
                return;
            }
            System.out.println("Unutma Ekiplerin seni kurtarana kadar hayatta kalman için malzeme listende Odun, Mont ve Meşale olmak zorunda");
            System.out.println("\nOyun başladı " + player.getPlayerName() +
                    "\n\nGüncel Bilgileriniz: " +
                    "\tSağlık: " + player.getHealt() +
                    "\tPara: " + player.getMoney() +
                    "\tZırh: " + player.getArmor() +
                    "\tSu: " + player.getWater() +
                    "\tYemek :" + player.getFood());
            System.out.println("" +
                    "Savaşmak için 1\n" +
                    "Mağazaya gitmek çin 2\n" +
                    "Güvenli Bölgeye çekilmek için 3 (Bu ekstra ücret içerir !!)");
            int select = input.nextInt();
            switch (select) {
                case 1: {
                    System.out.println("Nerede savaşacaksın. Unutma savaştığın bölgelerden malzemeleri getirdikten sonra " +
                            "bir daha o bölgeye gitmene, canını riske atmana gerek yok !");
                    System.out.println(
                            "Orman için 1\n" +
                            "Mağara için 2\n" +
                            "Şehir için 3\n");
                    int battleSelect = input.nextInt();

                    if(battleSelect == 1) {
                        if(Forest.isLogin) {
                            location = new Forest(this.player);
                            this.over =  location.onLocation();
                        } else {
                            System.out.println("Ormandan odunları aldın zaten. Bir daha buraya girmene gerek yok");
                        }
                        break;
                    }

                    else if(battleSelect == 2) {
                        if(Cave.isLogin) {
                            location = new Cave(this.player);
                            this.over =  location.onLocation();
                        } else {
                            System.out.println("Mağaradan Meşaleyi aldın zaten. Bir daha buraya girmene gerek yok");
                        }
                        break;
                    }

                    else if(battleSelect == 3) {
                        if(City.isLogin) {
                            location = new City(this.player);
                            this.over =  location.onLocation();
                            } else {
                                System.out.println("Şehirden Montu aldın zaten. Bir daha buraya girmene gerek yok");
                            }
                        }
                        break;
                }
                case 2: {
                    location = new ToolStore(this.player);
                    this.over = location.onLocation();
                    break;
                }
                case 3: {
                    player.setMoney(player.getMoney() - 2);
                    location = new SafeHouse(this.player);
                    this.over = location.onLocation();
                    break;
                }
                default:
                    location = new SafeHouse(this.player);
                    this.over = location.onLocation();
                    break;
            }
        }

    }
}
