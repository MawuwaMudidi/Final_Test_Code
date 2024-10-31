import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String licencePlate;
    private String colour;
    private double pricePerDay;
    private boolean rented;
    private boolean returned;
    private String customerName;
    List<String> rentalHistory = new ArrayList<>();

    //constructor for Vehicle
    public Vehicle(String licencePlate, String colour, double pricePerDay, boolean rented,
                   boolean returned, String customerName) {
        this.licencePlate = licencePlate;
        this.colour = colour;
        this.pricePerDay = pricePerDay;
        this.rented = rented;
        this.returned = returned;
        this.customerName = customerName;
        this.rentalHistory = new ArrayList<>();
    }
    public Vehicle(String licencePlate, String colour, double pricePerDay) {
        this.licencePlate = licencePlate;
        this.colour = colour;
        this.pricePerDay = pricePerDay;
        this.rented = false;
        this.returned = false;
    }
    //setters and getters
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public void setRented(boolean rented) {
        this.rented = rented;
    }
    public void setReturned(boolean returned) {
        this.returned = returned;
    }
    public String getLicencePlate() {
        return licencePlate;
    }
    public String getColour() {
        return colour;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public boolean isRented() {
        return rented;
    }
    public boolean isReturned() {
        return returned;
    }
    public List<String> getRentalHistory() {
        return rentalHistory;
    }
    //method to check if vehicle is currently free to rent
    public void currentlyFree() {
    if(rented == false && returned == false){
        System.out.println("The vehicle is currently free to rent");
    } else {
        System.out.println("The vehicle is currently not free to rent");
    }
    }
    //method to check the total rental price
    public double totalRentalPrice() {
        pricePerDay = pricePerDay * rentalHistory.size();
        return pricePerDay;
    }

    public void isRented(Customer customer) {
        if (rented == true) {
            System.out.println("Customer has rented the vehicle");
        } else {
            System.out.println("Customer has not rented the vehicle");
        }
        rentalHistory.add(customer.getName());
    }
    public void isReturned(Customer customer) {
    if(returned == true){
        System.out.println("Customer has returned the vehicle");
    } else {
        System.out.println("Customer has not returned the vehicle");
    }
    }
}
