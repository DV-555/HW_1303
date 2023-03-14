package Cars;
public class PassengerCar extends Car {
    private int numberOfSeats;
    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats=numberOfSeats;
    }
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
}
