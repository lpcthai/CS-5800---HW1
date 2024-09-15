package INHERITANCE;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee JoeJones = new SalariedEmployee("Joe", "Jones",
                "111-11-1111", 2500);
        System.out.println(
                "First name: " + JoeJones.getFirstName() +
                        " | Last name: " + JoeJones.getLastName() +
                        " | Social Sec #: " + JoeJones.getSocialSecurityNumber() +
                        " | Weekly Salary: $" + JoeJones.getWeeklySalary());

        HourlyEmployee StephanieSmith = new HourlyEmployee("Stephanie", "Smith",
                "222-22-2222", 25.00, 32);
        System.out.println(
                "First name: " + StephanieSmith.getFirstName() +
                        " | Last name: " + StephanieSmith.getLastName() +
                        " | Social Sec #: " + StephanieSmith.getSocialSecurityNumber() +
                        " | Wage: $" + StephanieSmith.getWage() +
                        " | Hours Worked: " + StephanieSmith.getHoursWorked());

        HourlyEmployee MaryQuinn = new HourlyEmployee("Mary", "Quinn",
                "333-33-3333", 19.00, 47);
        System.out.println(
                "First name: " + MaryQuinn.getFirstName() +
                        " | Last name: " + MaryQuinn.getLastName() +
                        " | Social Sec #: " + MaryQuinn.getSocialSecurityNumber() +
                        " | Wage: $" + MaryQuinn.getWage() +
                        " | Hours Worked: " + MaryQuinn.getHoursWorked());

        CommisionEmployee NicoleDior = new CommisionEmployee("Nicole", "Dior",
                "444-44-4444", 0.15, 50000.00);
        System.out.println(
                "First name: " + NicoleDior.getFirstName() +
                        " | Last name: " + NicoleDior.getLastName() +
                        " | Social Sec #: " + NicoleDior.getSocialSecurityNumber() +
                        " | Com rate: " + (NicoleDior.getCommissionRate() * 100) + "%" +
                        " | Gross salary: $" + NicoleDior.getGrossSalary());

        SalariedEmployee RenwaChanel = new SalariedEmployee("Renwa", "Chanel",
                "555-55-5555", 1700);
        System.out.println(
                "First name: " + RenwaChanel.getFirstName() +
                        " | Last name: " + RenwaChanel.getLastName() +
                        " | Social Sec #: " + RenwaChanel.getSocialSecurityNumber() +
                        " | Weekly Salary: $" + RenwaChanel.getWeeklySalary());

        BaseEmployee MikeDavenport = new BaseEmployee("Mike", "Davenport",
                "666-66-6666", 95000);
        System.out.println("First name: " + MikeDavenport.getFirstName() + " " +
                "| Last name:" + MikeDavenport.getLastName() +
                " | Social Sec #: " + MikeDavenport.getSocialSecurityNumber() +
                " | Base Salary: $" + MikeDavenport.getBaseSalary()

        );
        CommisionEmployee MahnazVaziri = new CommisionEmployee(" Mahnaz", "Vaziri",
                "777-77-7777", 0.22, 40000.00);
        System.out.println(
                "First name: " + MahnazVaziri.getFirstName() +
                        " | Last name: " + MahnazVaziri.getLastName() +
                        " | Social Sec #: " + MahnazVaziri.getSocialSecurityNumber() +
                        " | Com rate: " + (MahnazVaziri.getCommissionRate() * 100) + "%" +
                        " | Gross salary: $" + MahnazVaziri.getGrossSalary());
    }
}
