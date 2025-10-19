package nomor;

public class karakter {
    private String nama;
    private int hp;

    public karakter(String nama, int hp) {
        this.nama = nama;
        this.hp = hp;
    }

    public String getNama() {
        return nama;
    }

    public int getHp() {
        return hp;
    }

    public void diserang(int damage) {
        hp -= damage;
        System.out.println(nama + " menerima " + damage + " damage");
    }

    public void bergerak() {
        System.out.println(nama + " bergerak ke depan.");
    }
}
