package citation;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author elyvic
 */
public class ticketModel {
    
   private static final String USERNAME = "root";
   private static final String PASSWORD = "Sunichi07!";
   private static final String CONN_STRING = "jdbc:mysql://localhost:3306/citation";
    
    private ArrayList<ticket>ticketDB = new ArrayList<>();
    ticket currentTicket = new ticket();
    ticketGUI GUI = new ticketGUI();
    
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet Rs = null;
    
    public void setCurrentTicket(ticket currentTicket)
    {
        this.currentTicket = currentTicket;
        Database();
        
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
    
    public void Database(){
        
        
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected!");
            
            stmt = conn.createStatement();
            Rs = stmt.executeQuery("SELECT * FROM citation.citationinfo;");
            
            
            String licenseNo = currentTicket.getLicenseNo();
            String state = currentTicket.getState();
            String permitNo = currentTicket.getPermitNo();
            String vehicle = currentTicket.getVehicle();
            String color = currentTicket.getColor();
            String violation = currentTicket.getViolation();
            String date = currentTicket.getDate();
            String time = currentTicket.getTime();
            String location = currentTicket.getLocation();
            String issuedby = currentTicket.getIssuedby();
            String insert = "INSERT INTO citation.citationinfo" + " (License_Number, state, permit_Number, vehicle_Model, Color, Violation, Date, Time, Location, IssuedBy)" + " VALUES ('"+licenseNo+"','"+state+"','"+permitNo+"','"+vehicle+"','"+color+"','"+violation+"','"+date+"','"+time+"','"+location+"','"+issuedby+"')";
            
            while(Rs.next()){
                String licenseNoDB = Rs.getString("License_Number");
                String stateDB = Rs.getString("state");
                String permitNoDB = Rs.getString("permit_Number");
                String vehicleDB = Rs.getString("Vehicle_Model");
                String colorDB = Rs.getString("Color");
                String violationDB = Rs.getString("Violation");
                String dateDB = Rs.getString("Date");
                String timeDB = Rs.getString("Time");
                String locationDB = Rs.getString("Location");
                String issuedByDB = Rs.getString("IssuedBy");
                
                currentTicket = new ticket(licenseNoDB, stateDB, permitNoDB, vehicleDB, colorDB, violationDB, dateDB, timeDB, locationDB, issuedByDB);
                
                ticketDB.add(currentTicket);
                
                        
            }
            
            
            stmt.executeUpdate(insert);   
           
            
        
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }

    /**
     * @param ticketDB the ticketDB to set
     */
    public void setTicketDB(ArrayList<ticket> ticketDB) {
        this.ticketDB = ticketDB;
    }
    
   
    
}
