package Nonogram;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import Nonogram.Rooster;


public class MainKlasse extends Rooster{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int locatieRij;
        int locatieKolom;
        int aantalAanpassingen;
        String keuze = "";
        
        Nonogram nono = new Nonogram();
        System.out.println("Dit zijn de spelregels:");
        nono.geefSpelregels();
        System.out.println();
        
        Rooster rooster = new Rooster();
        rooster.printNonogram();

        Rooster oplossing = new Rooster();
        oplossing.oplossingInvullen();

        do {
            System.out.println("Wil je invullen (1) of leegmaken (eender welke geheel getal1) ?");
            if (input.nextInt() == 1) {
                System.out.println("Geef de rij: ");
                locatieRij = input.nextInt() - 1;

                System.out.println("Geef de kolom: ");
                locatieKolom = input.nextInt() - 1;
                rooster.vulVakjeIn(locatieRij, locatieKolom);
                keuze = input.nextLine();
                System.out.println("Type: 'Stop' om te stoppen of Enter");
                keuze = input.nextLine();
            } else {
                System.out.println("Geef de rij: ");
                locatieRij = input.nextInt() - 1;

                System.out.println("Geef de kolom: ");
                locatieKolom = input.nextInt() - 1;
                rooster.maakVakjeLeeg(locatieRij, locatieKolom);
                keuze = input.nextLine();
                System.out.println("Type: 'Stop' om te stoppen of Enter");
                keuze = input.nextLine();
            }
        }while(!keuze.equals("Stop"));

        rooster.checkIfCorrect();
    }
}
