package Nonogram;

public class Menu {
    // (1) Vraag nieuwe user of bestaand (skip naar 3)
    // (2) nieuwe account aanmaken en in database zetten
                // wachtwoord hashen
    // (3) Login
    // (4) Login checken (checken met waardes in database) (altijd) (terugkeerende user skip naar 6)
    // (5) nieuwe game starten (nieuwe user)
    // (6) voorgaande game starten voor terugkerende users.
System.out.print("Welk vakje wil je inkleuren? Geef de rij: ");
        rij = keyboard.nextInt()-1;
        System.out.print("Welk vakje wil je inkleuren? Geef de kolom: ");
        kolom = keyboard.nextInt()-1;

        testArray[rij][kolom] = "X   ";

}
