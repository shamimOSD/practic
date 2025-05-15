package ch3;
//Create a Employee class and test salary increases.

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            this.monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("Shamim", "Hossan", 30000.0);
        Employee emp2 = new Employee("Mohsin", "Sarder", 40000.0);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                "'s yearly salary: TK " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                "'s yearly salary: TK " + (emp2.getMonthlySalary() * 12));
        emp1.increaseSalary(10);
        emp2.increaseSalary(10);

        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                "'s new yearly salary: TK " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                "'s new yearly salary: TK " + (emp2.getMonthlySalary() * 12));
    }
}
