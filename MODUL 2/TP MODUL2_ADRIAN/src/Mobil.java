public class Mobil extends Kendaraan {
    
    int jumlahPintu;

    public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasistasPenumpang, int jumlahPintu) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasistasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String toString(){
        String returnString = "Jumlah Pintu : " + jumlahPintu + "\n";
        return super.toString() + returnString;
    }

}
