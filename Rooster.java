package Nonogram;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Rooster {
    String[][] rooster = new String[7][7];
    String[][] correct = new String[7][7];

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

    public void correctInvullen(){
        for (int i = 0; i < correct.length; i++) {
            for (int j = 0; j < correct.length; j++) {
                correct[i][j] = "    ";
            }
        }

        vulIn(correct);
        correct[2][2] = "X   ";
        correct[3][2] = "X   ";
        correct[2][3] = "X   ";
        correct[4][2] = "X   ";
        correct[6][2] = "X   ";
        correct[6][3] = "X   ";
        correct[6][4] = "X   ";
        correct[2][5] = "X   ";
        correct[3][5] = "X   ";
        correct[2][6] = "X   ";
        correct[3][6] = "X   ";
        correct[4][6] = "X   ";
        correct[5][6] = "X   ";
    }

    private void vulIn(String[][] nonogram) {
        nonogram[0][2] = "3   ";
        nonogram[0][3] = "1   ";
        nonogram[1][2] = "1   ";
        nonogram[1][3] = "1   ";
        nonogram[1][4] = "1   ";
        nonogram[1][5] = "2   ";
        nonogram[1][6] = "4   ";
        nonogram[2][0] = "2   ";
        nonogram[3][0] = "1   ";
        nonogram[4][0] = "1   ";
        nonogram[2][1] = "2   ";
        nonogram[3][1] = "2   ";
        nonogram[4][1] = "2   ";
        nonogram[5][1] = "1   ";
        nonogram[6][1] = "1   ";
    }

    public void checkIfCorrect(){
        vulIn(correct);
        int roosterArray[] = new int[20];
        int correctArray[]= new int[20];;

        for (int i = 2; i < rooster.length; i++) {
            for (int j = 2; j < rooster.length; j++) {//voor elke waarde in de matrix
                if(rooster[i][j].equals("X   ")){//kijkt na of waarde gelijk is aan X en zoja geeft die de waarde 1 anders 0
                    rooster[i][j] = "1";
                }else if(rooster[i][j].equals("    ")){
                    rooster[i][j] = "0";
                }
                correctArray[i] = (Integer.parseInt(rooster[i][j]));
            }
        }

        for (int i = 2; i < correct.length; i++) {
            for (int j = 2; j < correct.length; j++) {
                if (correct[i][j] == null) {
                    correct[i][j] = "0";
                } else if (correct[i][j].equals("    ")) {
                    correct[i][j] = "0";
                }
                else if (correct[i][j].equals("X   ")) {
                    correct[i][j] = "1";
                }

                correctArray[j] = (Integer.parseInt(rooster[i][j]));
            }
        }
        if(Arrays.toString(roosterArray) == Arrays.toString(correctArray)){
            System.out.println("U bent gewonnen");
        } else{
            System.out.println("U bent verloren");
        }
    }
}
