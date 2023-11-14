package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsNumber;
        int columnsNumber;

        do {
            System.out.println("Podaj liczbę wierszy");
            rowsNumber = scanner.nextInt();
            if (rowsNumber > 100)
                System.out.println("Liczba wierszy musi być mniejsza niż 100");
            else if (rowsNumber < 0)
                System.out.println("Liczba wierszy musi być większa niż 0");
        } while (rowsNumber > 100 || rowsNumber < 0);

        do {
            System.out.println("Podaj liczbę kolumn");
            columnsNumber = scanner.nextInt();
            if (columnsNumber > 100)
                System.out.println("Liczba kolumn musi być mniejsza niż 100");
            else if (columnsNumber < 0)
                System.out.println("Liczba kolumn musi być większa niż 0");
        } while (columnsNumber > 100 || columnsNumber < 0);

        int[][] array = new int[rowsNumber][columnsNumber];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }

        StringBuilder lineAfterRow = new StringBuilder();
        for (int[] row : array) {
            for (int cell : row) {
                System.out.printf("%4d |", cell);
                lineAfterRow.append("------");
            }
            System.out.println();
            System.out.println(lineAfterRow);
            lineAfterRow = new StringBuilder();
        }
    }
}
