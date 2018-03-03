package citation;

import java.util.ArrayList;

/**
 *
 * @author elyvic
 */
public class ticketModel {
    private ArrayList<ticket>ticketDB = new ArrayList<>();
    ticket currentTicket = new ticket();
    
    public void setCurrentTicket(ticket currentTicket)
    {
        this.currentTicket = currentTicket;
        getTicketDB().add(currentTicket);
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
    
    
}
