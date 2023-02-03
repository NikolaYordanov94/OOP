package WorkingWithAbstractionExercise.CardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());

        int cardPower = cardRank.getPower() + cardSuit.getPower();

        System.out.print("Card name: " + cardRank + " of " + cardSuit + ";");
        System.out.printf(" Card power: %d", cardPower);
    }
}
