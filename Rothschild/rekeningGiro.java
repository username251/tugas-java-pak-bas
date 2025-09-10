package Rothschild;

public class rekeningGiro extends rekening{
    public rekeningGiro(String NoRekening, double saldo)
    {
        super(NoRekening, saldo);
    }

    @Override
    public double HitungBunga()
    {
        return saldo * 0.01;
    }
}
