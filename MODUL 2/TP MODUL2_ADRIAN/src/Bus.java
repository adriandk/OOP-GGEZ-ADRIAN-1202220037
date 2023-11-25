public class Bus extends Kendaraan{

    int jumlahPintu;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasistasPenumpang, int jumlahPintu) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasistasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String toString(){

        String returnString = "Nomor Identifikasi : " + nomorIdentifikasi + "\n"
        + "Kecepatan Maksimum : " + kecepatanMaksimum + "\n"
        + "Kapasitas Penumpang : " + kapasistasPenumpang + "\n"
        + "Jumlah Pintu : " + jumlahPintu + "\n";

        return returnString;
    }

}