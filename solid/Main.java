package SOLID_Exercises.solid;

import EncapsulationExerciese.ShoppingSpree_03.Product;
import SOLID_Exercises.solid.Calculator.CalorieCalculator;
import SOLID_Exercises.solid.Calculator.ProteinCalculator;
import SOLID_Exercises.solid.Output.ConsoleOutput;
import SOLID_Exercises.solid.products.Drinks.Coke;
import SOLID_Exercises.solid.products.Drinks.Drink;
import SOLID_Exercises.solid.products.Food.Chips;
import SOLID_Exercises.solid.products.Food.Food;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CalorieCalculator calorieCalculator = new CalorieCalculator();
        ProteinCalculator proteinCalculator = new ProteinCalculator();
        Drink coke = new Coke(23.45);
        Food chips = new Chips(222.43);
        ConsoleOutput printer = new ConsoleOutput();
        List<Product> productList = new ArrayList<>();

    }
}
