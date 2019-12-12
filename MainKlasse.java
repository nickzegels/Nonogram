package Nonogram;
import java.util.Scanner;

public class MainKlasse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int locatieRij;
        int locatieKollom;

        //Loop rij
        do {
            System.out.println("Geef locatie van vakje van rij: ");
            while (!input.hasNextInt()) {
                System.out.println("Fout");
                input.next();
            }
            locatieRij = input.nextInt();
        } while (locatieRij <= 0 || locatieRij >= 5);

        //Loop kollom
        do {
                System.out.println("Geef locatie van vakje van Kollom: ");
            while (!input.hasNextInt()) {
                System.out.println("Fout");
                input.next();
            }
            locatieKollom = input.nextInt();
        } while (locatieKollom <= 0 || locatieKollom >= 5);
        System.out.println("Locatie Vakje: " + locatieRij + "," + locatieKollom);

    }
}

