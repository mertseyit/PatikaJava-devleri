import javax.tools.Tool;
import java.util.Scanner;

public class ToolStore extends Location{
    public ToolStore(Player player) {
        super(player);
    }

    private Scanner input = new Scanner(System.in);

    @Override
    public boolean onLocation() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Mağazaya hoşgeldiniz " + this.getPlayer().getPlayerName() + "Anlık bakiyeniz: " + this.getPlayer().getMoney());
            System.out.println(
                    "\n1 - Silah:" + Tools.gun +
                            "\n2 - Yemek: " + Tools.food + " \tFiyat: 10" +
                            "\n3- Su: " + Tools.water + " \tFiyat: 5" +
                            "\n4 - Zırh: " + Tools.armor + " \tFiyat: 30" +
                            "\nÇıkış için 0"
            );
            int select = input.nextInt();
            switch (select) {
                case 0: {
                    System.out.println("Yine bekleriz !!!");
                    exit = true;
                    break;
                }
                case 1: {
                    if (getPlayer().getMoney() < 30) {
                        System.out.println("Bakiyeniz yetersiz. Daha sonra tekrar gel olur mu");
                    } else {
                        System.out.println("Silah aldın");
                        getPlayer().setMoney(getPlayer().getMoney() - 30);
                        getPlayer().setGun(Tools.gun);
                    }
                    break;
                }
                case 2: {
                    if (getPlayer().getMoney() < 20) {
                        System.out.println("Para yetersiz. Daha sonra tekrar gel olur mu");
                    } else {
                        System.out.println("Yemek aldın");
                        getPlayer().setMoney(getPlayer().getMoney() - 20);
                        getPlayer().setFood(Tools.food);
                    }
                    break;
                }
                case 3: {
                    if (getPlayer().getMoney() < 30) {
                        System.out.println("Paran yetersiz. Daha sonra tekrar gel olur mu");
                    } else {
                        System.out.println("Su aldın");
                        getPlayer().setMoney(getPlayer().getMoney() - 30);
                        getPlayer().setWater(Tools.water);
                    }
                    break;
                }
                case 4: {
                    if (getPlayer().getMoney() < 40) {
                        System.out.println("Paran yetersiz. Daha sonra tekrar gel olur mu");
                    } else {
                        System.out.println("Zırh aldın");
                        getPlayer().setMoney(getPlayer().getMoney() - 40);
                        getPlayer().setArmor(Tools.armor);
                    }
                    break;
                }
            }
        }
        return false;
    }
}
