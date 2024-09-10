package POLYMORPHISM;

class CargoShip extends Ship {
    // Member variable for cargo capacity
    private int cargoCapacity;

    // Constructor
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Accessors (getters)
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Mutators (setters)
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void print() {
        System.out.println("Cargo Ship Name: " + getName() + ", Cargo Capacity: " + cargoCapacity + " tons");
    }
}
