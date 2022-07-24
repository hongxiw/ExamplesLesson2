public class Car {
    private final String MODEL;
    private final int YEAR;
    private int seats;
    private double gas;
    private double miles;
    private double lastWarningDistance;

    public Car(String model, int year, int seats) {
        MODEL = model;
        YEAR = year;
        this.seats = seats;
        gas = 0;
        miles = 0;
        lastWarningDistance = 0;
    }

    public String getModel() {
        return MODEL;
    }

    public int getYear() {
        return YEAR;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getMiles() {
        return miles;
    }


    public void drive(double miles) {
        if(gas <= 0) {
            System.out.println("The car is out of gas! Please refuel it!");
            return;
        }
        double gallonsRequired = miles / 10, milesDriven = miles;
        if(gas - gallonsRequired < 0) {
            milesDriven = gas * 10;
            gallonsRequired = milesDriven / 10;
            System.out.println("The car did not have enough gas to drive the entire " + miles + " miles");
        }
        this.miles += milesDriven;
        System.out.println("The car drove " + milesDriven + " miles.\nThe car now has driven a total of " + this.miles + " miles");
        gas -= gallonsRequired;
        double milesSinceLastWarning = this.miles - lastWarningDistance;
        if(milesSinceLastWarning >= 10) {
            int roundedMilesDriven = (int) milesSinceLastWarning / 10 * 10;
            System.out.println("The car has driven over " + roundedMilesDriven + " miles since the last warning. It has lost about " + roundedMilesDriven / 10 + " gallons of gas and now has " + gas + " gallons remaining");
            lastWarningDistance += roundedMilesDriven;
        }
    }

    public void refuel(double addGas) {
        gas += addGas;
        System.out.println("The car refueled with " + addGas + " gallons of gas.\nThe tank now contains " + gas + " gallons");
    }

    public String toString() {
        return "This car is a " + seats + "-seat " + MODEL + " built in " + YEAR + ".\nIt has driven " + miles + " miles.\nIt currently has " + gas + " gallons of gas";
    }

}