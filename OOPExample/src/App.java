public class App {
    public static void main(String[] args) throws Exception {

        boolean adalahHewan;

        Kucing kucing = new Kucing(4, "beranak", "omnivora", "Kucing");
        adalahHewan = kucing instanceof Hewan;
        kucing.printKucing(adalahHewan);

        Kucing kucingAnggora = new Kucing(4, "beranak", "omnivora", "Kucing", "Anggora");
        adalahHewan = kucingAnggora instanceof Hewan;
        kucingAnggora.printKucing(adalahHewan);
    }
}
