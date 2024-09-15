package POLYMORPHISM;

public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        // Initialize 3 arrays with one Ship, one CruiseShip, and one CargoShip
        ships[0] = new Ship("Panda", "2023");
        ships[1] = new CruiseShip("MoonStar", "1999", 2000);
        ships[2] = new CargoShip("Express", "2002", 70000);

        // a loop that iterates through the array calling each print function.
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
