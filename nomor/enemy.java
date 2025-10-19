
public class enemy extends karakter {
    public enemy(String nama, int hp) {
        super(nama, hp);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " berjalan ke arah player");
    }
}
