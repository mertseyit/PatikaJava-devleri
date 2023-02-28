public class City extends Location{
    public City(Player player) {
        super(player);
    }
    public static String loot = "Mont";
    static boolean isLogin = true;
    private Zombie zombie;
    private int random;

    @Override
    public boolean onLocation() {
        zombie = new Zombie(1,"Zombi",8,15,10);
        this.getInfoLocation("Şehirde",zombie.getCharacterName());
        int randomEnemyOfNumber = (int)(Math.random() * 10);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        if(randomEnemyOfNumber == 0) {
            System.out.println("Tüh Şehirde hiç "+ zombie.getCharacterName() + " yokmuş. Bir dahaki sefere artık....\n");
            return false;
        } else {
            System.out.println("\nOlamaz ! Şehirde " + randomEnemyOfNumber + " tane "+ zombie.getCharacterName() + " var. Onları yenmeyi dene ve ganimetleri güvenli bölgeye getir. Çabukkk!!\n\n");
        }
        for(int i=0; i<randomEnemyOfNumber; i++) {
            random = (int)(Math.random() * 101);
            System.out.println(random);
            if(random<=60) {
                System.out.println("Tam kafadan !!\n");
                zombie.setHealt(zombie.getHealt() - getPlayer().getDamage());

            } else if(random>60) {
                System.out.println("AAAAAHHHH !\n");
                if(getPlayer().getArmor() > 0) {
                    getPlayer().setArmor(getPlayer().getArmor() - zombie.getDamage());
                    getPlayer().setHealt(getPlayer().getHealt() - 2);
                } else {
                    getPlayer().setArmor(0);
                    getPlayer().setHealt(getPlayer().getHealt() - zombie.getDamage());
                }
            }
            if(getPlayer().getHealt()<0) {
                System.out.println("Olamaz " + getPlayer().getPlayerName() + ". Çok yaklaşmıştın......");
                System.out.println("kaybettiniz.");
                return true;
            } else if(zombie.getHealt() < 0) {
                System.out.println("Zombileri yendin ! Ganimetleri toplama zamanı !\nZobilerden Şunları Aldınız:" + "\nSu :  +6"+ "\tYemek: +7" + "\tPara: " + zombie.getMoney() + "\n\n");
                getPlayer().setMoney(getPlayer().getMoney() + zombie.getMoney());
                getPlayer().setFood(getPlayer().getFood() + 5);
                getPlayer().setWater(getPlayer().getWater() + 5);
                getPlayer().setIngredients(City.loot);
                //şu kısmı değiştir
                System.out.println("Şu ganimetleri aldınız: " + City.loot);
                System.out.println("Ganımet Listen: " + getPlayer().getIngredients());
                isLogin = false;
                return false;
            }
        }

        System.out.println("Zombileri Yenemedin. Şehre tekrar gir ve ganimetleri toplamak için tekrar savaş...!");
        return false;
    }
}
