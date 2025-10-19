
public class utama {
    public class Main {
    public static void main(String[] args) {
        player player1 = new player("Alex", 100, 0);
        enemy enemy1 = new enemy("Zombie", 80);

        player1.bergerak();  // hasil: Alex berlari cepat!
        enemy1.bergerak();  // hasil: Zombie berjalan lambat ke arah pemain...

        enemy1.diserang(20);
        player1.tambahSkor(10);
    }
}

}
