import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printWordWhile();
        System.out.println();

        printWordFor();
        System.out.println();

        printWordInColumn();

        printOlympicDate();
        printOlympicDateFor();

        printMultipleTable(4);

        System.out.println("Введите количество этажей");
        checkBuildingFloors(scanner.nextInt());

        System.out.println("Введите диапазон значений от меньшего к большему");
        printNumbersInRange(scanner.nextInt(), scanner.nextInt());

        System.out.println();

        System.out.println("Введите диапазон значений от меньшего к большему");
        printNumbersInRangeWhile(scanner.nextInt(), scanner.nextInt());

        System.out.println();

        calculateSystemEquations(100);
    }

    public static void printWordWhile() {
        int i = 0;

        while (i < 10) {
            System.out.print("Java ");

            i++;
        }
    }

    public static void printWordFor() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Java ");
        }
    }

    public static void printWordInColumn() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Java");
        }
    }

    public static void printOlympicDate() {
        int year = 1980;

        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");

            year += 4;
        }
    }

    public static void printOlympicDateFor() {
        for (int year = 1980; year <= 2020; year += 4) {
            System.out.println("Олимпиада " + year + " года");
        }
    }

    public static void printMultipleTable(int k) {
        for (int i = 0; i <= 9; i++) {
            System.out.println(i + " x " + k + " = " + (i * k));
        }
    }

    public static void checkBuildingFloors(int floorsQuantity) {
        if (floorsQuantity <= 0) {
            System.out.println("Ошибка ввода");
        }

        if (floorsQuantity >= 1 && floorsQuantity <= 4) {
            System.out.println("Малоэтажный дом");
        }

        if (floorsQuantity >= 5 && floorsQuantity <= 8) {
            System.out.println("Среднеэтажный дом");
        }

        if (floorsQuantity >= 9) {
            System.out.println("Многоэтажный дом");
        }
    }

    public static void printNumbersInRange(int start, int end) {
        if (start >= end) {
            System.out.println("Некорректный ввод");
            return;
        }

        for (int i = start + 1; i < end; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printNumbersInRangeWhile(int start, int end) {
        if (start >= end) {
            System.out.println("Некорректный ввод");
            return;
        }

        int i = start + 1;

        while (i < end) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }

            i++;
        }
    }

    public static void calculateSystemEquations(double x) {
        if (x >= 5) {
            System.out.println("y = " + ((x * x) - 10) / (x + 7));
            return;
        }

        if ((x > (-3)) && (x < 5)) {
            System.out.println("y = " + (x + 3) * ((x * x) - 2));
            return;
        }

        System.out.println("y = 420");
    }
}