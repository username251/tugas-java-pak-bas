import java.util.Scanner;   

class Highway
{
    static int funds;

    public static void initialFunds(int BaseFunds)
    {
        funds = BaseFunds;
    }

    public static void tapIn(String gerbangAwal, String gerbangAkhir, String arahPerjalanan)
    {
        int tarif = calculateTarif(gerbangAwal, gerbangAkhir, arahPerjalanan);
        if (funds >= tarif)
        {
            funds -= tarif;
            System.out.println("Tap-In berhasil! tarif perjalanan: Rp." + tarif);
            System.out.println("Sisa saldo anda: Rp." + funds);
        }
        else
        {
            System.out.println("Saldo anda kurang.");
            System.out.println("tarif perjalanan dari gerbang toll " + gerbangAwal + " ke gerbang " + gerbangAkhir + " adalah sebesar: Rp." + tarif);
            System.out.println("saldo saat ini: Rp. " + funds);
            tapIn(gerbangAwal, gerbangAkhir, arahPerjalanan); 
        }
    }

    
}

public class HighwaysTicket {
    public static void main(String[] args) {
        System.out.println("test");
    }
}
