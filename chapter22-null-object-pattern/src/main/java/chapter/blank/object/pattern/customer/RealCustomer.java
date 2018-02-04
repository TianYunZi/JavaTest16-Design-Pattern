package chapter.blank.object.pattern.customer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        super.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
