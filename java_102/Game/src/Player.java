import javax.net.ssl.SNIHostName;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    private int damage;
    private int healt;
    public static ArrayList ingredients = new ArrayList();
    private int food;
    private int armor;
    private int water;
    private String gun;

    public int getFood() {
        return food;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    private String charName;
    private int money;
    private String  playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public void selectCharacter() {
        Scanner input = new Scanner(System.in);
        GameCharacter[] gameCharacters = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Oyunu başlatmak için bir karakter seçiniz:");
        for (GameCharacter gameCharacter: gameCharacters) {
            System.out.println(
                    "ID: " + gameCharacter.getId() +
                    "\t Karakter: " + gameCharacter.getCharacterName() +
                    "\t Hasar: " + gameCharacter.getDamage() +
                    "\t Sağlık: " + gameCharacter.getHealt() +
                    "\t Para: " + gameCharacter.getMoney());
        }
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 2: {
                this.initCharacter(new Archer());
                break;
            }
            case 3: {
                this.initCharacter(new Knight());
                break;
            }
            case 1:
            default: {
                this.initCharacter(new Samurai());
                break;
            }
        }
        System.out.println(
                "Karakter: " + this.getCharName() +
                "\t Hasar: " + this.getDamage() +
                "\t Sağlık: " + this.getHealt() +
                "\t Para: " + this.getMoney()
        );
    }

    public void initCharacter(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealt(gameCharacter.getHealt());
        this.setMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getCharacterName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getArmor() {
        return armor;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients.add(ingredients);
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public String getGun() {
        return gun;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
