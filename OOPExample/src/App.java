public class App {
    public static void main(String[] args) throws Exception {

        boolean adalahHewan;
        
        Burung burung = new Burung(2, "bertelur", "omnivora", "Burung");
        adalahHewan = burung instanceof Hewan;
        burung.printBurung(adalahHewan);

        Kucing kucing = new Kucing(4, "beranak", "omnivora", "Kucing");
        adalahHewan = kucing instanceof Hewan;
        kucing.printKucing(adalahHewan);

        Ikan ikan = new Ikan(0, "bertelur", "omnivora", "Ikan");
        adalahHewan = ikan instanceof Hewan;
        ikan.printIkan(adalahHewan);
    }
}
