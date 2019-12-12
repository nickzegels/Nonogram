package Nonogram;

public class Nonogram {
    public void printNonogram1(){
        String[][] rooster = new String[7][7];

        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                rooster[i][j] = "0   ";
            }
        }

        rooster[1][2] = "3   ";
        rooster[1][3] = "2   ";
        rooster[0][4] = "2   ";
        rooster[1][4] = "1   ";
        rooster[0][5] = "2   ";
        rooster[1][5] = "1   ";
        rooster[1][6] = "2   ";


        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                System.out.print(rooster[i][j]);
            }
            System.out.println("");
        }
    }
}
