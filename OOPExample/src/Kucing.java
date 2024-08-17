public class Kucing extends Hewan{

    protected String jenisKucing = null;

    public Kucing(int kakiHewan, String caraReporduksi, String jenisMakanan, String namaHewan) {
        super(kakiHewan, caraReporduksi, jenisMakanan, namaHewan);
    }

    public Kucing(int kakiHewan, String caraReporduksi, String jenisMakanan, String namaHewan, String jenisKucing) {
        super(kakiHewan, caraReporduksi, jenisMakanan, namaHewan);
        this.jenisKucing = jenisKucing;
    }

    public void printKucing(boolean isHewan){
        System.out.println("Nama hewan = " + this.nama);
        System.out.println("Apakah " + this.nama + " adalah hewan? " + isHewan);
        System.out.println("Jumlah kaki burung : " + this.kaki);
        System.out.println(this.nama + " adalah hewan " + this.makanan);
        System.out.println(this.nama + " adalah hewan yang " + this.reproduksi);
        if (jenisKucing != null) {
            System.out.println("Jenis kucing ini adalah : " + this.jenisKucing);
        }
        System.out.println("============================");
    }

    @Override
    public void suara() {
        System.out.println(this.nama + " mengeong");
    }
    
}
