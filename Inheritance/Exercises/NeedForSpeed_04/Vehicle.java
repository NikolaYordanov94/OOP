package InheritanceExercises.NeedForSpeed_04;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        setFuel(fuel);
        setHorsePower(horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    private void setFuel(double fuel) {
        this.fuel = fuel;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers){
        if(fuel >= kilometers * fuelConsumption){
            fuel -= kilometers * fuelConsumption;
        }
    }


}
