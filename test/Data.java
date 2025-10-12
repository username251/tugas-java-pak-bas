class segitiga {
    int alas = 10, tinggi = 20;
    float luas;

    void hitungLuas() {
        luas = (alas * tinggi) / 2;
    }
}

public class Data {
    public static void main(String[] args) {
        segitiga segitigaOBJ = new segitiga();
        segitigaOBJ.hitungLuas();
        System.out.println("Luas Segitiga: " + segitigaOBJ.luas);
    }
}