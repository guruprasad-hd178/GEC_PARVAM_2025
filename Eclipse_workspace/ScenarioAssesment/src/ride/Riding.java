package ride;

abstract class User {
    private String name;
    private String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public abstract void showProfile();

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

class Driver extends User {
    private String vehicle;

    public Driver(String name, String phone, String vehicle) {
        super(name, phone);
        this.vehicle = vehicle;
    }

    @Override
    public void showProfile() {
        System.out.println("Driver Profile: " + getName() + 
                         ", Vehicle: " + vehicle + 
                         ", Contact: " + getPhone());
    }
}

class Customer extends User {
    private String pickupLocation;

    public Customer(String name, String phone, String pickupLocation) {
        super(name, phone);
        this.pickupLocation = pickupLocation;
    }

    @Override
    public void showProfile() {
        System.out.println("Customer Profile: " + getName() + 
                         ", Pickup: " + pickupLocation + 
                         ", Contact: " + getPhone());
    }
}

interface Ride {
    void book(String from, String to);
}

class UberRide implements Ride {
    @Override
    public void book(String from, String to) {
        System.out.println("Uber ride booked from " + from + " to " + to);
        // Uber-specific booking logic
    }
}

public class Riding
{
	public static void main(String[] args) {
		User u1 = new Driver("Guru", "9876454437", "car");
		u1.showProfile();
		
		User u2 = new Customer("Guru", "93647263546", "Hassan");
		u2.showProfile();
		
		UberRide r1 = new UberRide();
		r1.book("Hassan", "Bengaluru");
	}
}
