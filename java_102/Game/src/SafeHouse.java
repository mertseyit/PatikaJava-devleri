import java.util.Scanner;
public class SafeHouse extends Location{
    public SafeHouse(Player player) {
        super(player);
    }
    Location location;
    private Scanner input = new Scanner(System.in);

    @Override
    public boolean onLocation() {
        getPlayer().setHealt(20);
        System.out.println("Şu an güvenli bölgedesiniz. Burada düşmanlardan uzaktasın. Ve aynı zamanda canını da fulledik !\nYapmak istediğiniz işlemi seçin:");
        System.out.println("Savaş alanına dönmek için 0\nMağazaya gitmek için 1 tuşlayınız.");
        int select = input.nextInt();
        switch (select) {
            case 1: {
                location = new ToolStore(this.getPlayer());
                location.onLocation();
                break;
            }
            case 0 :
            default: {
                break;
            }
        }
        return false;
    }
}
