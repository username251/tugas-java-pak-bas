// Removed package declaration

public class game {
    public static void main(String[] args) {
        Player user = new Player();

        user.name = "Hero";
        user.health = 100;
        user.speed = 10;

        user.run();

        if (user.isDead()) {
            System.out.println(" is dead.");
    }
}
}
