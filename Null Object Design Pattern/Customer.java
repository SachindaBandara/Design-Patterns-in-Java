abstract class Customer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}

class RealCustomer extends Customer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
class NullCustomer extends Customer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static Customer getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}