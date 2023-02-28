public class Cave extends Location {

    static boolean isLogin = true;
    private Vampire vampire;
    public static String loot = "Meşale";
    private int random;

    public Cave(Player player) {
        super(player);
    }

    public boolean onLocation() {
        vampire = new Vampire(1, "Vampir", 9, 20, 12);
        this.getInfoLocation("Mağarada", vampire.getCharacterName());
        int randomEnemyOfNumber = (int) (Math.random() * 10);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        if (randomEnemyOfNumber == 0) {
            System.out.println("Tüh Mağarada hiç " + vampire.getCharacterName() + " yokmuş. Bir dahaki sefere artık....\n");
            return false;
        } else {
            System.out.println("\nOlamaz ! Mağarada " + randomEnemyOfNumber + " tane " + vampire.getCharacterName() + " var. Onları yenmeyi dene ve ganimetleri güvenli bölgeye getir. Çabukkk!!\n\n");
        }
        for (int i = 0; i < randomEnemyOfNumber; i++) {
            random = (int) (Math.random() * 101);
            System.out.println(random);
            if (random <= 67) {
                System.out.println("Al bakalım pis kan emici !!\n");
                vampire.setHealt(vampire.getHealt() - getPlayer().getDamage());

            } else if (random > 67) {
                System.out.println("AAAAAHHHH !\n");
                if (getPlayer().getArmor() > 0) {
                    getPlayer().setArmor(getPlayer().getArmor() - vampire.getDamage());
                    getPlayer().setHealt(getPlayer().getHealt() - 2);
                } else {
                    getPlayer().setArmor(0);
                    getPlayer().setHealt(getPlayer().getHealt() - vampire.getDamage());
                }
            }
            if (getPlayer().getHealt() < 0) {
                System.out.println("Olamaz " + getPlayer().getPlayerName() + ". Çok yaklaşmıştın......");
                System.out.println("kaybettiniz.");
                return true;
            } else if (vampire.getHealt() < 0) {
                System.out.println("Zombileri yendin ! Ganimetleri toplama zamanı !\nZobilerden Şunları Aldınız:" + "\nSu :  +6" + "\tYemek: +7" + "\tPara: " + vampire.getMoney() + "\n\n");
                getPlayer().setMoney(getPlayer().getMoney() + vampire.getMoney());
                getPlayer().setFood(getPlayer().getFood() + 5);
                getPlayer().setWater(getPlayer().getWater() + 5);
                getPlayer().setIngredients(Cave.loot);
                //şu kısmı değiştir
                System.out.println("Şu ganimetleri aldınız: " + Cave.loot);
                System.out.println("Ganımet Listen: " + getPlayer().getIngredients());
                isLogin = false;
                return false;
            }
        }

        System.out.println("Zombileri Yenemedin. Şehre tekrar gir ve ganimetleri toplamak için tekrar savaş...!");
        return false;
    }
}
