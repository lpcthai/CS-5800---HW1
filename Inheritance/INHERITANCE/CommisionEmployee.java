public class CommisionEmployee extends Employee {
    private double commissionRate;
    private double grossSalary;

    // Constructor
    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
    }

    // Accessors
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    // Mutators
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
