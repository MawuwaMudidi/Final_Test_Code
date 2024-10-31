import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private int age;
    List<String> customers = new ArrayList<>();

    //constructor for customer.
    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.customers = new ArrayList<>();
    }
    //setter and getters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String name) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name +
                ", address=" + address +
                ", age=" + age + '}';
    }


}