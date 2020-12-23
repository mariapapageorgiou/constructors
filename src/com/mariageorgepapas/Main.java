package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

        // when you type the keyword new, Java creates the constructor
        Account mariasAccount = new Account("12345", 0.0, "Maria Maple",
                "myemail@maria.com", "(012) 345-6789");

//        mariasAccount.setNumber("12345");
//        mariasAccount.setBalance(0.0);
//        mariasAccount.setCustomerName("Maria Maple");
//        mariasAccount.setCustomerEmailAddress("myemail@maria.com");
//        mariasAccount.setCustomerPhoneNumber("(012) 345-6789");

        System.out.println(mariasAccount.getNumber());
        System.out.println(mariasAccount.getBalance());

        mariasAccount.withdrawal(100.0);
        mariasAccount.deposit(50.0);

        mariasAccount.withdrawal(100.0);
        mariasAccount.deposit(51.0);

        mariasAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        System.out.println("\n");

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Cate", 25000.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Maria", 100.00, "maria@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
    }
}
