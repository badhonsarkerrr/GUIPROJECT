package entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public abstract class Ticket implements Bookable {
    protected String passengerName;
    protected int seatNo;
    protected double price;
    
    protected boolean isBooked = false;

    public Ticket() {
    }

    public Ticket(String passengerName, int seatNo) {
        System.out.println("P-Ticket Created.");
        this.passengerName = passengerName;
        this.seatNo = seatNo;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void showTicket() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Price: " + price + "Taka");
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Not Booked"));
    }
   
    public abstract boolean bookTicket(double payment); // Abstract method
    

    public void insertInfo() {
        try {
            File file = new File("./Data/userdata.txt");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
            String timeAndDate = myDateObj.format(myFormatObj);

            FileWriter fwriter = new FileWriter(file, true);
            fwriter.write("Date and Time: " + timeAndDate + "\n");
            fwriter.write("========================================================\n");
            fwriter.write("Seat No: " + seatNo + "\n");
            fwriter.write("Passenger Name: " + passengerName + "\n");
            fwriter.write("Ticket Price: " + price + "\n");
            fwriter.write("Booking Status: Booked\n");
            fwriter.write("--------------------------------------------------------\n");
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error writing to file!");
        }
    }
}