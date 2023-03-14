package Cars;

public class Main {
    public static void main(String[] args) {

        Track track=new Track();
        track.setColour("White");
        track.setLoadCapacity(6500);
        track.setProductionDate(2021);
        System.out.println( "\n"+"Track's Colour is "+track.getColour()+" it's from Year "+track.getProductionDate()+" and has LoadCapacity of "+track.getLoadCapacity());

        track.drive();
        System.out.println();

        PassengerCar passengerCar=new PassengerCar();
        passengerCar.setModel("Audi");
        passengerCar.setColour("Black");
        passengerCar.setProductionDate(2021);
        passengerCar.setNumberOfSeats(5);
        System.out.println(passengerCar.getModel()+" colored "+passengerCar.getColour()+" it's from "+passengerCar.getProductionDate()+" and has "+passengerCar.getNumberOfSeats()+" Seats");
        passengerCar.stop();

        /*
        Track's Colour is White it's from Year 2021 and has LoadCapacity of 6500
        Car accelerates now

        Audi colored Black it's from 2021 and has 5 Seats
        Car stops now
        */
    }
}
