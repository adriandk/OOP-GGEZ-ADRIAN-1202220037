public class Bus extends Kendaraan{

    private int jumlahPintu;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasistasPenumpang) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasistasPenumpang);
        this.jumlahPintu = 0;
    }

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasistasPenumpang, int jumlahPintu) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasistasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String toString(){
        String returnString = "Jumlah Pintu : " + jumlahPintu + "\n";
        return super.toString() + returnString;
    }

}
