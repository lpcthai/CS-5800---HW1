package POLYMORPHISM;

class CruiseShip extends Ship {
    // Member variable for maximum passengers
    private int maxPassengers;

    // Constructor
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Accessors (getters)
    public int getMaxPassengers() {
        return maxPassengers;
    }

    // Mutators (setters)
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }


    public void print() {
        System.out.println("Cruise Ship Name: " + getName() + ", Max Passengers: " + maxPassengers);
    }
}
