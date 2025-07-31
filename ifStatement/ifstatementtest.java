package ifStatement;

import java.util.Scanner;

public class ifstatementtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan harga:");
        double harga = scanner.nextDouble();
        double diskon;
        
        if (harga >= 500000.0)
        {
            diskon = harga * 0.2;
            double total = harga - diskon;
            System.out.println(nama + ", anda mendapat diskon sebesar 20% yaitu: " + total);
        }
        else if (harga >= 300000.0 && harga < 500000.0) {
            diskon = harga * 0.1;
            double total = harga - diskon;
            System.out.println(nama + ", anda mendapat diskon sebesar 10% yaitu: " + total);
        } else
        {
            System.out.println(nama + ", tidak ada diskon untuk anda");
        }
    }
}
