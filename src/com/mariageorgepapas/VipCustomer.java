package com.mariageorgepapas;

/* Create a new class VipCustomer. It should have 3 fields name, credit limit, and email address. Create 3 constructors.
   1st constructor empty should call the constructor with 3 parameters with default values
   2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
   3rd constructor should save all fields.
   Create getters only for this using code generation of intellij as setters wont be needed
   Test and confirm it works.
 */

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}