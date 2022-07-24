public class Car {
    private String carModel;
    private int year;
    private int seats;
    private double galOfGas;
    private double miles;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void drive(double miles) {
        this.miles += miles;
        System.out.println("The car drove " + miles + " and the car drove the total of" + this.miles);
    }

    public void refuel(double galsOfGas) {
        this.galOfGas += galsOfGas;
        System.out.println("The amount of gas refueled is " + galsOfGas + " The total amount of gas is " + this.galOfGas);
    }


}

