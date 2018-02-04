package chapter.blank.object.pattern.factory;

import chapter.blank.object.pattern.customer.AbstractCustomer;
import chapter.blank.object.pattern.customer.NullCustomer;
import chapter.blank.object.pattern.customer.RealCustomer;

public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getAbstractCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
