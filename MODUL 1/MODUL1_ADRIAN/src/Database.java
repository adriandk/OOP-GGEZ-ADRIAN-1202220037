import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    ArrayList<Konser> konserList = new ArrayList<>();

    // TODO: Create Method to insert Konser to Database
    public void addKonser(Konser konser){
        konserList.add(konser);
    }
    // TODO: Create Method to Show Konser from Database
    public void showKonser(){
        for(Konser konser : konserList){
            System.out.println(konser.getBandName());
            System.out.println("Tanggal Konser : " + konser.getTanggal());
            System.out.println("Lokasi : " + konser.getLokasi());
            System.out.println("Harga tiket : " + konser.getHargaTikect());
            System.out.println();
        }
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void buyTikect(int tiket, int jumlah){
    }

}
