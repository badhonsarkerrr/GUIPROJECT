package entity;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import entity.Ticket;
import entity.TrainTicket;

public class Train {
    private String trainName;
    private Ticket[] tickets = new Ticket[4];


    public Train(String trainName) {
        this.trainName = trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainName() {
        return trainName;
    }

    public void insertTicket() {
        
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null) {
                tickets[i] = new TrainTicket(); 
                System.out.println("Empty ticket slot created at index " + i);
                break;
            } else {
                System.out.println("No empty slot for ticket " + i);
            }
        }
    }

    public Ticket getTicket(int index) {
        if (index >= 0 && index < tickets.length) {
            return tickets[index];
        }
        return null;
    }

    public void removeTicket(int index) {
        if (index >= 0 && index < tickets.length) {
            tickets[index] = null;
            System.out.println("Ticket at index " + index + " removed.");
        }
    }
    
 
    public void sellTicket(String passengerName, int seatNo, double price, double payment) {

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null) {
            Ticket newTicket = new TrainTicket(passengerName, seatNo, price); // Changed to TrainTicket
         
                if (newTicket.bookTicket(payment)) {
                   
                    tickets[i] = newTicket;
                    System.out.println("Ticket successfully issued and added to the train.");
                }
                return;
        }
        System.out.println("The train is full. Cannot sell a new ticket.");
    }
}
}