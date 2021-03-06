import java.util.Scanner;

public class MutliDimensionalArrayWithMethodsUsageAndGlobalVariable {

    static int[][] ships = new int[10][10];

    public static void main(String[] args) {
        MethodsUsageExcersises methodsUsageExcersises = new MethodsUsageExcersises();
        System.out.println(methodsUsageExcersises.cutStringToMaxSize("abcdef", 4));
        methodsUsageExcersises.showStringIfLong("abcd", 6);
        System.out.println(methodsUsageExcersises.sumFromOneToN(3));

        // Zadanie 1 (gra w statki)
        // stworzyc dwuwymiarowa tablice, ktora trzyma wartosci 0 i ma rozmiary 10 x 10
        // w kilku losowych miejscach przypisac wartosc 1 (czyli zrobic statki)
        // przy pomocy Scanner pobrac wiersz i kolumne, na ktora chcemy oddac strzal
        // wyswietlic wynik, czy trafione, czy pudlo

        generateShipsBoard();

        int shootColumn = getShootValue("column");
        int shootRow = getShootValue("row");

        checkIfShipWasShoot(shootColumn, shootRow);
        // Zadanie 2 (zliczanie mieszkancow w budynky)
        // stworzyc trojwymiarowa tablice, ktora bedzie pod nr klatki, pietra i mieszkania
        // trzymac informacje o ilosci osob tam mieszkajacych
        // policzyc ile osob mieszka w budynku
        // czyli int[][][] budynek, gdzie np. budynek[0][0][0] to bedzie ilosc mieszkancow
        // w zerowej klatce na parterze w mieszkaniu nr 0
    }

    static void checkIfShipWasShoot(int column, int row) {
        System.out.println("Sprawdzam strzal");
        if (ships[column][row] == 1) {
            System.out.println("Trafiony!!");
        } else {
            System.out.println("Pudło :(");
        }
    }

    static void generateShipsBoard() {
        ships[0][0] = 1;
        ships[0][1] = 1;
        ships[0][2] = 1;
        ships[0][3] = 1;

        ships[6][7] = 1;
        ships[6][8] = 1;
        ships[6][9] = 1;

        ships[2][7] = 1;
        ships[3][7] = 1;
        ships[4][7] = 1;
    }

    static int getShootValue(String dimensionType) {
        System.out.println("Type " + dimensionType + " number to shoot:");
        Scanner scanner = new Scanner(System.in);
        int shootValue = scanner.nextInt();
        return shootValue;
    }
}
