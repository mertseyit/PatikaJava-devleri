public class GameCharacter {
    private String characterName;
    private int id;
    private int damage;
    private int healt;
    private int money;

    public GameCharacter(int id,String characterName, int damage, int healt, int money) {
        this.id = id;
        this.characterName = characterName;
        this.damage = damage;
        this.healt = healt;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
}
