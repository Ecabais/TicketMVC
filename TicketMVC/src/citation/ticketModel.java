package citation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elyvic
 */
public class ticketModel {
    
    private Scanner read;
    private File fileName = new File("tickets.dat");
    private ArrayList<ticket>ticketDB = new ArrayList<>();
    ticket currentTicket = new ticket();
    ticketGUI GUI = new ticketGUI();
    
    public void setCurrentTicket(ticket currentTicket)
    {
        this.currentTicket = currentTicket;
        WriteFile();
        ReadFile();
    }
    
     public ticket getCurrentTicket()
    {
        return currentTicket;
    }
     
      public ArrayList<ticket> getCurrentTickets()
    {
        return getTicketDB();
    }

    /**
     * @return the ticketDB
     */
    public ArrayList<ticket> getTicketDB() {
        return ticketDB;
    }

    /**
     * @param ticketDB the ticketDB to set
     */
    public void setTicketDB(ArrayList<ticket> ticketDB) {
        this.ticketDB = ticketDB;
    }
    
    public void WriteFile()
    {
        
        
        try{
            
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter tix = new PrintWriter(bw);
            
        
            
            
            String licenseNo = currentTicket.getLicenseNo();
            String permitNo = currentTicket.getPermitNo();
            String state = currentTicket.getState();
            String vehicle = currentTicket.getVehicle();
            String color = currentTicket.getColor();
            String violation = currentTicket.getViolation();
            String date = currentTicket.getDate();
            String location = currentTicket.getLocation();
            String time = currentTicket.getTime();
            String issuedby = currentTicket.getIssuedby();
            
            tix.write(licenseNo + " " + permitNo + " " + state + " " + vehicle + " " + color+ " " + violation + " " + date + " " + location + time + " " + issuedby +"\n");
            
           
        
        
        tix.close();
        
        
        
      }
      catch(Exception ex)
      {
          GUI.Error();
      }
    
        
    }
    
    
    public void ReadFile(){
        try{
            BufferedWriter bw = null;
            bw = new BufferedWriter (new FileWriter("tickets.dat", true));
            Scanner input = new Scanner(fileName);
            
            
            
            while(input.hasNext()){
            String licenseNo = input.next();
            String state = input.next();
            String permitNo =  input.next();
            String vehicle  = input.next();
            String color = input.next();
            String date = input.next();
            String violation = input.next();
            String time = input.next();
            String location = input.next();
            String issuedby = input.next();
               
               ticket currentData = new ticket(licenseNo,state,permitNo,vehicle,color,date,violation,time,location,issuedby);
               ticketDB.add(currentData);
               int x = ticketDB.size();
               System.out.println(x);
            }
            input.close();
        }
        catch(IOException ex)
        {
            GUI.Error();
        }
    }
    
}
