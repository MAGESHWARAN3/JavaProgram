

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Tata", "Tata 234", 2929, "Petrol", 8.233, 23.4);
        System.out.println("Truck model: " + truck.getModel());
        System.out.println("Fuel efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance travel: " + truck.calculateDistanceTravel() + " miles");
        System.out.println("Max speed: " + truck.getMaxSpeed() + " mph");
    }
}










