package SOLID_Exercises.solid.Calculator;

import SOLID_Exercises.solid.products.Product;

import java.util.List;

public interface Calculator {
    double total(List<Product> products);
    double average(List<Product> products);
}
