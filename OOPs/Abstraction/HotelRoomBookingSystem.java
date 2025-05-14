public class HotelRoomBookingSystem {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Suite");
        Hotel h2 = new Hotel("Delux", 15000.0);
        Hotel h3 = new Hotel("Normal", 10000.0, 102);

        h1.displayDetails();
        h2.displayDetails();
        h3.displayDetails();
    }
}

class Hotel {
    String roomtype;
    double roomrate;
    int roomnumber;

    public Hotel(String roomtype, double roomrate, int roomnumber) {
        this.roomtype = roomtype;
        this.roomrate = roomrate;
        this.roomnumber = roomnumber;
    }
    public Hotel(String roomtype,double roomrate) {
        this(roomtype,roomrate,0);
    }
    public Hotel(String roomtype) {
        this(roomtype, 0.0, 0);
    }
    void displayDetails() {
        System.out.println("Room Type: " + this.roomtype);
        System.out.println("Room Rate: " + this.roomrate);
        System.out.println("Room Number: " + this.roomnumber);
    }
}