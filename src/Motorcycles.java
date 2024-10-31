public class Motorcycles extends Vehicle{


    public Motorcycles(String licencePlate, String colour, double pricePerDay, boolean rented, boolean returned, String customerName) {
        super(licencePlate, colour, pricePerDay, rented, returned, customerName);
    }

    //method to display all information on motorcycles
    public void displayInformation(){
        System.out.println("The motorcycles are: ");
    }
    //method to display  all rental history for motorcycles.
    public void rentalHistory(){
        System.out.println("The motorcycles rental history is: ");
    }

}
