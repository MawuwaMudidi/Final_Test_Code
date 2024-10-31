public class Cars extends Vehicle{

    public Cars(String licencePlate, String colour, double pricePerDay, boolean rented, boolean returned, String customerName) {
        super(licencePlate, colour, pricePerDay, rented, returned, customerName);
    }

    //method to display all information on cars.
    public void displayInformation(){
        System.out.println("The cars details are: ");
    }
    //method to display rental history for the cars.
    public void rentalHistory(){
        System.out.println("The cars rental history is: ");
    }
}
