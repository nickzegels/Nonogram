package Nonogram;

public class Rooster {
      public static void main(String[] args) {
        String[][] testArray = new String[5][5];

        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                testArray[i][j] = "0   ";
            }
        }

        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                System.out.print(testArray[i][j]);
            }
            System.out.println("");
        }
    }
}
