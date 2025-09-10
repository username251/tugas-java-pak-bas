package Rothschild;

import java.util.*;

public class MainBank {
    static Scanner input = new Scanner(System.in);
    static rekening Rekening;
    public static void main(String[] args) {
        
        System.out.println(" Masukkan Nomor Rekening: ");
        String noRek = input.nextLine();
        System.out.println("Masukkan Saldo: ");
        double saldo = input.nextDouble();
        System.out.println("Pilih Jenis Rekening: \n1. Tabungan \n2. Giro \n3. Deposito");
        int choices = input.nextInt();

        if (choices == 1)
        {
            System.out.println("masukkan suku bunga (%): ");
            input.nextDouble();
            Rekening = new rekeningTabungan(noRek, saldo);
        }
        else if (choices == 3)
        {
            System.out.println("masukkan jangka waktu (bulan): ");
            input.nextInt();
            Rekening = new rekeningDeposito(noRek, saldo);
        }
        else if (choices == 2)
        {
            System.out.println("masukkan limit overdraft: ");
            input.nextDouble();
            Rekening = new rekeningGiro(noRek, saldo);
        }

        System.out.println("\n|^^INFORMASI REKENING^^|");
        Rekening.TampilkanData(Rekening.NoRekening, Rekening.saldo);
        System.out.printf("Bunga yang didapat: " + Rekening.HitungBunga());
    }
}