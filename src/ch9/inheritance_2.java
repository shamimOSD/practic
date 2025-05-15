package ch9;

//CommissionEmployee test

 class CommissionEmployee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public static void main(String[] args) {




        CommissionEmployee employee = new CommissionEmployee("Shamim", "Hossan", "222-22-2222", 10000, .06);

        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public void setGrossSales(double sales) {
        if (sales >= 0.0)
            grossSales = sales;
        else
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0)
            commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    public double earnings() {
        return commissionRate * grossSales;
    }

}
