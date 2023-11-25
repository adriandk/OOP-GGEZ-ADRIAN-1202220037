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
        return "true";
    }

    public double hitungWaktuTempuh(double jarak){
        double waktuTempuh;

        waktuTempuh = this.kecepatanMaksimum / jarak;

        return waktuTempuh;
    }
}
