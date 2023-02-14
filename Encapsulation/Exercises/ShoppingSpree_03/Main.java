package EncapsulationExerciese.ShoppingSpree_03;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] people = scanner.nextLine().split(";");
        Map<String, Person> peopleMap = new LinkedHashMap<>();

        for (String personString : people) {
            String[] personData = personString.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try{
                Person person = new Person(name, money);
                peopleMap.put(name, person);
            }catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }
        String[] products = scanner.nextLine().split(";");
        Map<String, Product> productMap = new LinkedHashMap<>();

        for(String productString : products){
         String[] productData = productString.split("=");
         String nameOfProduct = productData[0];
         double price = Double.parseDouble(productData[1]);

         try{
             Product product = new Product(nameOfProduct, price);
             productMap.put(nameOfProduct, product);
         }catch (IllegalArgumentException ex){
             System.out.println(ex.getMessage());
             return;
         }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")){

            String nameOfPerson = command.split("\\s+")[0];
            String nameOfProduct = command.split("\\s+")[1];

            Person buyer = peopleMap.get(nameOfPerson);
            Product product = productMap.get(nameOfProduct);
            try{
                buyer.buyProduct(product);
                System.out.printf("%s bought %s%n", nameOfPerson, nameOfProduct);
        } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            command = scanner.nextLine();
        }
        peopleMap.values().forEach(System.out::println);
    }
}
