package PolymorphismExercises.Vehicles_01;
import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance){
        double fuelNeeded = distance * getFuelConsumption();
        if(fuelNeeded > fuelQuantity){
            return this.getClass().getSimpleName() + " needs refueling";
        }
        setFuelQuantity(getFuelQuantity() - fuelNeeded);
        DecimalFormat df = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
    }

    public void refuel(double liters){
        this.fuelQuantity += liters;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f", this.getClass().getSimpleName(), fuelQuantity);
    }
}
