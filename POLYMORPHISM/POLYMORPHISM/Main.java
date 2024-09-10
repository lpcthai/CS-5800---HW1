package POLYMORPHISM;

public class Main {
    public static void main(String[] args) {
        // Create an array of Ship objects
        Ship[] ships = new Ship[3];

        // Initialize the array with one Ship, one CruiseShip, and one CargoShip
        ships[0] = new Ship("Panda", "2023");
        ships[1] = new CruiseShip("MoonStar", "1999", 2000);
        ships[2] = new CargoShip("Express", "2002", 70000);

        // Loop through the array and call the print function for each ship
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
