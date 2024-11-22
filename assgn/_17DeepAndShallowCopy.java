package assgn;
class Person25 {
    String name = "Nikita";
    Address address; // Reference to an Address object

    public Person25(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy constructor (default behavior)
    public Person25(Person25 other) {
        this.name = other.name; // Copy the primitive field (name) by value
        this.address = other.address; // Shallow copy: copy the reference (address)
    }
}

class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}


public class _17DeepAndShallowCopy {
    public static void main(String[] args) {
        Person25 p1 = new Person25(null);
        
    }
}
