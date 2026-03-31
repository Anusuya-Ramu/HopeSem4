package Task9;

class Vehicle {
    private String bikeName;
    private String carName;

    // Getter for bike
    public String getBikeName() {
        return bikeName;
    }

    // Setter for bike
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    // Getter for car
    public String getCarName() {
        return carName;
    }

    // Setter for car
    public void setCarName(String carName) {
        this.carName = carName;
    }
}


    
public class GetterSetter {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        // Setting values
        v.setBikeName("Yamaha R15");
        v.setCarName("Hyundai Creta");

        // Getting values
        System.out.println("Bike name is: " + v.getBikeName());
        System.out.println("Car name is: " + v.getCarName());
    }
}
