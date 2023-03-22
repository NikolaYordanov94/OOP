package PolymorphismExercises.Vehicles_01;

public class Car extends Vehicle{

    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption){
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }
}
