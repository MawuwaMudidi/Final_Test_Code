//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //instances for vehicle
        Vehicle car = new Vehicle("UBJ234A", "Black",499.99);
        Vehicle truck = new Vehicle("UBL345B", "Red", 1999.99);
        Vehicle motorcycle = new Vehicle("UBD876C", "Blue", 299.99);

        //instances for customer
        Customer customer1 = new Customer("Jean", "Kampala", 30);
        Customer customer2 = new Customer("John", "Kabale", 25);
        Customer customer3 = new Customer("Joseph", "Kampala", 40);
        Customer customer4 = new Customer("Jane", "Kabale", 20);

        //method to check if customer has rented or returned the vehicle

        car.currentlyFree();
        System.out.println(customer1.getName() + " has rented the car.");
        car.isReturned(customer1);
        System.out.println(customer1.getName() + " has returned the car.");


        //method to calculate to total rental pri
        car.totalRentalPrice();
        System.out.println(customer1.getName() + " total rental price  for the car is: " + car.totalRentalPrice());



    }
}