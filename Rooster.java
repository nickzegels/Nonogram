package Nonogram;
import java.util.Scanner;

public class Rooster {
    String[][] rooster = new String[5][5];
    public void printMatrix(){

        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                rooster[i][j] = "0   ";
            }
        }

        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                System.out.print(rooster[i][j]);
            }
            System.out.println("");
        }
    }

    public void vulVakjeIn(int locatieRij, int locatieKolom){
        int rij = locatieRij;
        int kolom = locatieKolom;

        rooster[rij][kolom] = "X   ";

        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                System.out.print(rooster[i][j]);
            }
            System.out.println("");
        }
    }

    public void maakVakjeLeeg(int locatieRij, int locatieKolom){
        int rij = locatieRij;
        int kolom = locatieKolom;

        rooster[rij][kolom] = "0   ";

        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                System.out.print(rooster[i][j]);
            }
            System.out.println("");
        }
    }
}
