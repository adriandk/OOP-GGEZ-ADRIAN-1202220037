public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    
    private String bandName, tanggal, lokasi;
    private int hargaTiket;

    public Konser(String bandName, String tanggal, String lokasi, int hargaTiket) {
        this.bandName = bandName;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.hargaTiket = hargaTiket;
    }

    public String getBandName() {
        return bandName;
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getLokasi() {
        return lokasi;
    }
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public int getHargaTiket() {
        return hargaTiket;
    }
    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    

}