public class Ikan extends Hewan {

    public Ikan(int kakiHewan, String caraReporduksi, String jenisMakanan, String namaHewan) {
        super(kakiHewan, caraReporduksi, jenisMakanan, namaHewan);
    }

    public void printIkan(boolean isHewan){
        System.out.println("Nama hewan = " + this.nama);
        System.out.println("Apakah" + this.nama + "adalah hewan? " + isHewan);
        System.out.println("Jumlah kaki burung : " + this.kaki);
        System.out.println(this.nama + " adalah hewan " + this.makanan);
        System.out.println(this.nama + " adalah hewan yang " + this.reproduksi);
        System.out.println("============================");
    }

    @Override
    public void suara() {
        System.out.println(this.nama + " tidak bersuara");
    }

}
