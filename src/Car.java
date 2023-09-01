class Car extends Vehicle {
    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public static void honk() {
        System.out.print("Honk, Honk!");
    }

     public static void displayInfo() {
        System.out.println("Number of wheels: " + car.getNumberOfWheels);
        System.out.println("Color: " + car.getColor);
        System.out.println("Engine size: " + car.getEngineSize);
        System.out.println("Fuel type: " + car.getFuelType);
        System.out.println("Brand name: " + car.getBrand);
    }
}
