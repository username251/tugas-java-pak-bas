package train_tickets;
import java.util.Scanner;

public class ticketkereta 
{
    static int funds;

    public static void initialFunds(int BaseFunds)
    {
        funds = BaseFunds;
    }

    public static void tapIn()
    {
        if (funds >= 10000)
        {
            System.out.println("Tap-In berhasil. Selamat menikmati perjalanan");
            funds -= 3000;
            System.out.println("Sisa saldo anda saat sekarang: Rp. " + funds);
        }
        else
        {
            System.out.println("Saldo anda tidak cukup.");
            System.out.println("Saldo anda sekarang: Rp. " + funds);
            System.out.println("Silahkan isi ulang kartu anda.");
            refill();
        }
    }

    public static void refill()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah top-up saldo anda: Rp. ");
        int topUp = input.nextInt();
        funds += topUp;
        System.out.println("Saldo anda telah terisi sebanyak: Rp. " + funds);
        tapIn();
        input.close();
    }
    
    public static void main(String[] args) 
    {
        initialFunds(5000);
        tapIn();
    }
}