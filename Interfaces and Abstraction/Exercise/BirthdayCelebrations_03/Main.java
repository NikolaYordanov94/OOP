package InterfacesAndAbstractionExercises.BirthdayCelebrations_03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> birthableList = new ArrayList<>();

        while (!input.equals("End")){

            String[] inputParts = input.split(" ");
            String typeOfObj = inputParts[0];
            String name = inputParts[1];

            switch (typeOfObj){
                case"Citizen":
                    int age = Integer.parseInt(inputParts[2]);
                    String id = inputParts[3];
                    String birthDate = inputParts[4];
                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    birthableList.add(citizen);
                    break;

                case"Pet":
                    String birthDatePet = inputParts[2];
                    Pet pet = new Pet(name, birthDatePet);
                    birthableList.add(pet);
                    break;

                case"Robot":
                    break;
            }

            input = scanner.nextLine();
        }
        String searchedYearOfBirth = scanner.nextLine();
        boolean searchedYearFound = false;

        for(Birthable birthable : birthableList){
            String currentYearOfBirth = birthable.getBirthDate().split("\\/")[2];
            if(currentYearOfBirth.equals(searchedYearOfBirth)){
                searchedYearFound = true;
                System.out.println(birthable.getBirthDate());
            }
        }

        if (!searchedYearFound){
            System.out.println("<no output>");
        }
    }
}

