class Main {
    public static void main(String[] args) {
        // Create a new car object
        Car car = new Car("Civic", "Honda", 2021, 25000.0, "Blue", 10);

        // Print the initial state of the car
        System.out.println(car.toString());

        // Sell some cars
        car.sell(2);

        // Print the state of the car after selling some cars
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Quantity: " + car.getQuantity());

        // Change the car's color and price
        car.setColor("Red");
        car.setPrice(27000.0);

        // Print the state of the car after changing its color and price
        System.out.println(car.toString());
    }
}
et