package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getCylinders() { return cylinders; }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": " + cylinders + " cylinder gas engine is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": driving on gas, " + avgKmPerLitre + " km per litre");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas engine is running");
    }
}
