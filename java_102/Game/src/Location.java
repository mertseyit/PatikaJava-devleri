public abstract class Location {
    private Player player;

    public Location(Player player) {
        this.player = player;
    }

    public abstract boolean onLocation();
    public void getInfoLocation(String locationName, String gameCharacterName) {
        System.out.println();
        System.out.println("\n\n" + locationName +" " + gameCharacterName + " var ! Dikkat ET !\n");
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
