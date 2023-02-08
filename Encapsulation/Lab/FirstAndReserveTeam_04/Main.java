package Encapsulation.FirstAndReserveTeam_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Team team = new Team("Black Eagles");

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            double salary = Double.parseDouble(data[3]);

            Person person = new Person(firstName, lastName, age, salary);
            team.addPlayer(person);
        }

            System.out.println("First team have " + team.getFirstTeam().size() + " players");
            System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");

        }

    }
