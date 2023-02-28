public class Forest extends Location{
    public Forest(Player player) {
        super(player);
    }
    static boolean isLogin = true;
    public static String loot = "Odun";
    private Bear bear;
    private int random;
    @Override
    public boolean onLocation() {
        bear = new Bear(1,"Ayı",7,15,10);
        this.getInfoLocation("Ormanda", bear.getCharacterName());
        int randomEnemyOfNumber = (int)(Math.random() * 10);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        if(randomEnemyOfNumber == 0) {
            System.out.println("Tüh Ormanda hiç ayı yokmuş. Bir dahaki sefere artık....\n");
            return false;
        } else {
            System.out.println("\nOlamaz ! Ormanda " + randomEnemyOfNumber + " tane Ayı var. Onları yenmeyi dene ve ganimetleri güvenli bölgeye getir. Çabukkk!!\n\n");
        }
        for(int i=0; i<randomEnemyOfNumber; i++) {
            random = (int)(Math.random() * 101);

            if(random<=70) {
                System.out.println("Ayıya okkalı bir tokat indi\n");
                bear.setHealt(bear.getHealt() - getPlayer().getDamage());

            } else if(random>70) {
                System.out.println("AAAAAHHHH\n");
                if(getPlayer().getArmor() > 0) {
                    getPlayer().setArmor(getPlayer().getArmor() - bear.getDamage());
                    getPlayer().setHealt(getPlayer().getHealt() - 2);
                } else {
                    getPlayer().setArmor(0);
                    getPlayer().setHealt(getPlayer().getHealt() - bear.getDamage());
                }
            }
            if(getPlayer().getHealt()<0) {
                System.out.println("Olamaz " + getPlayer().getPlayerName() + ". Çok yaklaşmıştın......");
                System.out.println("kaybettiniz.");
                return true;
            } else if(bear.getHealt() < 0) {
                System.out.println("Ayıyı yendin ! Ganimetleri toplama zamanı !\nAyıdan Şunları Aldınız:" + "\nSu :  +5"+ "\tYemek: +5" + "\tPara: " + bear.getMoney() + "\n\n");
                getPlayer().setMoney(getPlayer().getMoney() + bear.getMoney());
                getPlayer().setFood(getPlayer().getFood() + 5);
                getPlayer().setWater(getPlayer().getWater() + 5);
                getPlayer().setIngredients(Forest.loot);
                System.out.println("Şu ganimetleri aldınız: " + Forest.loot);
                System.out.println("Ganımet Listen: " + getPlayer().getIngredients());
                isLogin = false;
                return false;
            }
        }

        System.out.println("Ayıyı Yenemedin. Ormana tekrar gir ve ganimetleri toplamak için tekrar savaş...!");
        return false;
    }
}
