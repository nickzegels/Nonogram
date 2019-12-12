package Nonogram;
import java.util.Scanner;
import Nonogram.Rooster;

public class MainKlasse extends Rooster{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int locatieRij;
        int locatieKolom;
        int aantalAanpassingen;
        String keuze = "";

        Rooster rooster = new Rooster();
        rooster.printMatrix();

        do {
            System.out.println("Wil je invullen (1) of leegmaken (2) ?");
            if (input.nextInt() == 1) {
                System.out.println("Geef de rij: ");
                locatieRij = input.nextInt() - 1;

                System.out.println("Geef de kolom: ");
                locatieKolom = input.nextInt() - 1;
                rooster.vulVakjeIn(locatieRij, locatieKolom);

                System.out.println("Type: 'Stop' om te stoppen of type: 'Doorgaan' om door te gaan");
                keuze = input.nextLine();
            } else if (input.nextInt() == 2) {
                System.out.println("Geef de rij: ");
                locatieRij = input.nextInt() - 1;

                System.out.println("Geef de kolom: ");
                locatieKolom = input.nextInt() - 1;
                rooster.maakVakjeLeeg(locatieRij, locatieKolom);

                System.out.println("Type: 'Stop' om te stoppen of type: 'Doorgaan' om door te gaan");
                keuze = input.nextLine();
            }
        }while(!keuze.equals("Stop"));
    }
}
