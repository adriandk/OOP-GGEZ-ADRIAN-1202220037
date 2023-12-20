public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    public void printTicket(String nama, String noHandphone) {
        System.out.println("Mencetak tiket....");
        System.out.println("================");
        System.out.println("Nama : " + nama);
        System.out.println("No Handphone : " + noHandphone);
    }

    public boolean isBooked(){
        return true;
    }
}

