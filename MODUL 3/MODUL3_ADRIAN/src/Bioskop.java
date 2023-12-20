public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int rows = 5;
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int seatPerRows = 10;
    
    // TO DO: Create 2 dimensional array to store seat reservation status
    int[][] seats = new int[rows][seatPerRows];

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        for(int i = 0 ; i < rows ; i++){
            for(int x = 0 ; x < seatPerRows ; x++){
                seats[i][x] = 0;
            }
        }
        seats[0][1] = 1;
        seats[1][1] = 1;
        seats[4][1] = 1;
        seats[0][1] = 1;
    }

    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for(int i = 0 ; i < rows ; i++){
            for(int x = 0 ; x < seatPerRows ; x++){
                System.out.print(seats[i][x]);
            }
            System.out.println();
        }
    }

    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[row][seat] == 0) {
            System.out.println("Kuris berhasil dipesan " + row + ", " + seat);
        } else {
            System.out.println("Error " + row + ", " + seat + " sudah dipesan");
        }
    }
}