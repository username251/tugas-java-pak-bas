package latihan_parkir;

import java.util.Scanner;

public class LatihanParkir {
    public static int hitungBiaya(String jenisKendaraan, int parkirDuration, boolean isMember)
    {
        int biaya = 0;
        if (jenisKendaraan.equalsIgnoreCase("Mobil"))
        {
            biaya = 5000;
            parkirDuration--;
            biaya += parkirDuration * 3000;
        }
        else if (jenisKendaraan.equalsIgnoreCase("Motor"))
        {
        biaya = 3000;
        parkirDuration--;
        biaya += parkirDuration * 2000;
        }
        if (isMember)
        {
            biaya = (int) (biaya * 0.9);
        }
        return biaya;
    }

    public static void tampilanProgramme(String jenisKendaraan, int parkirDuration, boolean isMember, int biaya)
    {
        System.out.println();
        System.out.println("Rician Parkir");
        System.out.println("***************************");
        System.out.println("Jenis Kendaraan\t: " + jenisKendaraan);
        System.out.println("Durasi Parkir\t: " + parkirDuration);
        System.out.println("Status Member?\t: " + (isMember ? "Ya" : "Tidak"));
        System.out.println("***************************");
        System.out.println("Total Biaya\t: " + biaya);
        System.out.println("***************************");
        if (isMember)
        {
            System.out.println("Anda mendapatkan bonus diskon 10% ");
        }
    }
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    System.out.println("Masukan jenis kendaraan: " );
    String kendaraan = input.nextLine();
    System.out.println("Durasi Parkir: " );
    int durasi = input.nextInt();
    System.out.println("Apakah Member?(Y/N): ");
    String answer = input.next();

    boolean isMember = answer.equalsIgnoreCase("Y");
    int totalParkir = hitungBiaya(kendaraan, durasi, isMember);
    tampilanProgramme(kendaraan, durasi, isMember, totalParkir);

    input.close();
}
    
}