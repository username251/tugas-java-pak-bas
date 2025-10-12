package AccessModifier;

public class guru {
    public String nama;
    protected int nip;
    private double gaji;

    public guru(String name, int NIP, double salary)
    {
        this.nama = name;
        this.nip = NIP;
        this.gaji = salary;
    }

    public void tampilkandataguru()
    {
        System.out.println("nama: " + nama);
        System.out.println("nip: " + nip);
        System.out.println("gaji: " + gaji);
    }

    public double GetSalary()
    {
        return gaji;
    }

    public void SetSalary(double salary)
    {
        this.gaji = salary;
    }
}
