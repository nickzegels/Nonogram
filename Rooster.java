package Nonogram;
import java.util.Objects;
import java.util.Scanner;

public class Rooster {
    String[][] rooster = new String[7][7];
    String[][] oplossing = new String[7][7];

    public void vulVakjeIn(int locatieRij, int locatieKolom){
        int rij = locatieRij;
        int kolom = locatieKolom;

        rooster[rij + 2][kolom + 2] = "X   ";

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

        rooster[rij + 2][kolom + 2] = "    ";

        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                System.out.print(rooster[i][j]);
            }
            System.out.println("");
        }
    }

    public void printNonogram(){
        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                rooster[i][j] = "    ";
            }
        }

        vulIn(rooster);

        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                System.out.print(rooster[i][j]);
            }
            System.out.println("");
        }
    }

    public void oplossingInvullen(){
        for (int i = 0; i < oplossing.length; i++) {
            for (int j = 0; j < oplossing.length; j++) {
                oplossing[i][j] = "    ";
            }
        }

        vulIn(oplossing);
        oplossing[2][2] = "X   ";
        oplossing[3][2] = "X   ";
        oplossing[2][3] = "X   ";
        oplossing[4][2] = "X   ";
        oplossing[6][2] = "X   ";
        oplossing[6][3] = "X   ";
        oplossing[6][4] = "X   ";
        oplossing[2][5] = "X   ";
        oplossing[3][5] = "X   ";
        oplossing[2][6] = "X   ";
        oplossing[3][6] = "X   ";
        oplossing[4][6] = "X   ";
        oplossing[5][6] = "X   ";
    }

    private void vulIn(String[][] oplossing) {
        oplossing[0][2] = "3   ";
        oplossing[0][3] = "1   ";
        oplossing[1][2] = "1   ";
        oplossing[1][3] = "1   ";
        oplossing[1][4] = "1   ";
        oplossing[1][5] = "2   ";
        oplossing[1][6] = "4   ";
        oplossing[2][0] = "2   ";
        oplossing[3][0] = "1   ";
        oplossing[4][0] = "1   ";
        oplossing[2][1] = "2   ";
        oplossing[3][1] = "2   ";
        oplossing[4][1] = "2   ";
        oplossing[5][1] = "1   ";
        oplossing[6][1] = "1   ";
    }

    public void checkIfCorrect(){
        int counter = 0;
        for (int i = 0; i < rooster.length; i++) {
            for (int j = 0; j < rooster.length; j++) {
                if(rooster[i][j].equals(oplossing[i][j])){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
