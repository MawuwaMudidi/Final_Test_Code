public class Trucks extends Vehicle{

    public Trucks(String licencePlate, String colour, double pricePerDay, boolean rented, boolean returned, String customerName) {
        super(licencePlate, colour, pricePerDay, rented, returned, customerName);
    }

    //method to display all information on trucks.
    public void displayInformation(){
        System.out.println("The trucks information are: ");
    }
    //method to display rental history for the trucks
    public void rentalHistory(){
        System.out.println("The trucks rental history is: ");
    }
}
