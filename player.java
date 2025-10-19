package nomor;

public class player extends karakter {
    private int skor;

    public player(String nama, int hp, int skor) {
        super(nama, hp);
        this.skor = skor;
    }

    public void tambahSkor(int poin) {
        skor += poin;
        System.out.println(getNama() + " mendapatkan poin total: " + skor);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " berlari cepat ke depan");
    }
}
