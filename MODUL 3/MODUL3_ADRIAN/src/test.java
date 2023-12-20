public class test {
    public static void main(String[] args) {
        int[][] testArray;
        testArray = new int[5][10];

        for(int i = 0 ; i < 5 ; i++){
            for(int x = 0 ; x < 10 ; x++){
                testArray[i][x] = 0;
            }
        }

        testArray[0][1] = 1;
        testArray[1][9] = 1;
        testArray[4][5] = 1;
        testArray[3][1] = 1;

        for(int i = 0 ; i < 5 ; i++){
            for(int x = 0 ; x < 10 ; x++){
                System.out.print(testArray[i][x]);
            }
            System.out.println();
        }

        if (testArray[4][5] == 0) {
            System.out.println("Kuris berhasil dipesan ");
        } else {
            System.out.println("Error sudah dipesan");
        }
    }
}
