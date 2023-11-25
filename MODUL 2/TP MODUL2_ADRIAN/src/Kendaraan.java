public class Kendaraan {

    String nomorIdentifikasi;
    double kecepatanMaksimum;
    int kapasistasPenumpang;
    
    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasistasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasistasPenumpang = kapasistasPenumpang;
    }

    public String toString(){
        String returnString = "Nomor Identifikasi : " + nomorIdentifikasi + "\n"
        + "Kecepatan Maksimum : " + kecepatanMaksimum + "\n"
        + "Kapasitas Penumpang : " + kapasistasPenumpang + "\n";
        
        return returnString;
    }

    public double hitungWaktuTempuh(double jarak){
        double waktuTempuh;

        waktuTempuh = this.kecepatanMaksimum / jarak;

        return waktuTempuh;
    }
}
