package Nonogram;

public class Nonogram {
  public String geefSpelregels() {
        try {
            File myObj = new File("src\\nonogramConsole\\spelregels.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Er ging iets mis bij het opvragen van de spelregels");
            e.printStackTrace();
        }
        return "";
    }
}
