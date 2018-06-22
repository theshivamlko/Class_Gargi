class Employee  extends WorkingPerson {

    private final int TAX = 18;

    public Employee() {
        System.out.println("EMployee");
        // Employee employee=new Employee();
        // employee.hadLunch();
    }

    public double calcTax(double salary) {

        double tax = salary * TAX / 100;
        System.out.println(tax);
        return tax;
    }
}