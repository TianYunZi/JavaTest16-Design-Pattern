package chapter.blank.object.pattern;

import chapter.blank.object.pattern.customer.AbstractCustomer;
import chapter.blank.object.pattern.factory.CustomerFactory;

public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getAbstractCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getAbstractCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getAbstractCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getAbstractCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
