package POLYMORPHISM;

class CruiseShip extends Ship {
    // Member variable for maximum passengers
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

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
