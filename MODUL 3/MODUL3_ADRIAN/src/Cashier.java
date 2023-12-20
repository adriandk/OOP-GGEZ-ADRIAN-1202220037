import java.util.ArrayList;

public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket

    ArrayList<String> bookedSeat = new ArrayList<String>();

    public void seatNumber(String seat){
        bookedSeat.add(seat);
    }

    public void printTicket(String nama, String noHandphone) {
        System.out.println("Mencetak tiket....");
        if (bookedSeat.size() == 0) {
            System.out.println("Anda belum memilih kursi!");
        } else {
            for (String i : bookedSeat) {
                System.out.println("================");
                System.out.println("Nama : " + nama);
                System.out.println("No Handphone : " + noHandphone);
                System.out.println("Seat : " + i);
                System.out.println("================");
                System.out.println("Selamat menonton! \n");
            }
        }
    }
}

