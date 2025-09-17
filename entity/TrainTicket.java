package entity;

import javax.swing.JOptionPane;



public class TrainTicket extends Ticket {
    public TrainTicket() {
        super();
    }
    public TrainTicket(String passengerName, int seatNo, double price) {
        super(passengerName, seatNo); 
        this.price = price;           
        System.out.println("Train Ticket created.");
    }
    
  
    public boolean bookTicket(double payment) {
        if (payment >= this.price) {
            this.isBooked = true; 
            System.out.println("Ticket for " + passengerName + " has been successfully booked.");
            insertInfo();
            JOptionPane.showMessageDialog(null, "Payment Successful! \nAmount Paid: " + payment);
            return true;
        } else {
            System.out.println("Payment is insufficient. Booking failed.");
            JOptionPane.showMessageDialog(null, "Payment is insufficient. Booking failed.");
            return false;
        }
    }
}