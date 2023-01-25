package WorkingWithAbstraction;
import java.util.Scanner;

public class RhombusOfStars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //горна част
        //бр. редове == n

        printTOpPart(n);

        //средна част -> 1 ред –> n = бр. звезди
        printMiddlePart(n);

        //долна част

        printBottomPart(n);
    }

    private static void printBottomPart(int n) {
        for (int row = n - 1; row >= 1; row--) {
            //принтирам ред
            printRow(n, row);
        }
    }

    private static void printMiddlePart(int n) {
        for (int star = 1; star <= n; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printTOpPart(int n) {
        for (int row = 1; row <= n - 1; row++) {
            //принтирам ред
            printRow(n, row);
        }
    }

    private static void printRow(int n, int row) {
        //всеки ред -> {брой интервали} {бр. звезди}
        //1 ред -> 2 инт + 1 зв
        //2 ред -> 1 инт + 2 зв
        for (int space = 1; space <= n - row; space++) {
            System.out.print(" ");
        }
        for (int star = 1; star <= row; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
