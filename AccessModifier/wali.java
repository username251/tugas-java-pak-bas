package AccessModifier;

public class wali extends guru {
    String KelasBinaan;

    public wali(String name, int NIP, double salary, String kelasbinaan)
        {
            super(name, NIP, salary);
            this.KelasBinaan = kelasbinaan;
    }

    public void tampilkandatawali()
    {
        System.out.println("nama: " + nama);
        System.out.println("nip: " + nip);
        System.out.println("gaji: " + GetSalary());
        System.out.println("kelas binaan: " + KelasBinaan);
    }
}
