public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    
    private String bandName, tanggal, lokasi;
    private int hargaTikect;

    public Konser(String bandName, String tanggal, String lokasi, int hargaTikect) {
        this.bandName = bandName;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.hargaTikect = hargaTikect;
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
    public int getHargaTikect() {
        return hargaTikect;
    }
    public void setHargaTikect(int hargaTikect) {
        this.hargaTikect = hargaTikect;
    }
    

}