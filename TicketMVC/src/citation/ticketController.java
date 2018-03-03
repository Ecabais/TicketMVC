/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citation;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author elyvic
 */
public class ticketController {
    ticketModel TicketModel;
    ticketGUI GUI;
    int j = 0;
    
    public ticketController(ticketModel TicketModel, ticketGUI GUI) {
        this.TicketModel = TicketModel;
        this.GUI = GUI;
        attachHandlers();
    }
   
    
    /*
    *  all Button eventhandler
    */
    public void attachHandlers()
    {
        
       /********************************
        *   View button eventhandler   *
        *******************************/
      GUI.getViewBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    
                  ArrayList<ticket> Tickets = TicketModel.getCurrentTickets();
			
		GUI.updateTicketGUIAll(Tickets);
                }
                }
      
      );
      
      
      /*************************************
      *   form submit Button eventhandler  *
      *************************************/
      GUI.getSubmitBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    //get fields
                    String licenseNo = GUI.getLicenseTF().getText();
                    String state = GUI.getStateTF().getText();
                    String permitNo = GUI.getPermitTF().getText();
                    String vehicle = GUI.getVehicleTF().getText();
                    String color = GUI.getColorTF().getText();
                    String violation = GUI.getViolation1();
                    String date = GUI.getDateTF().getText();
                    String time = GUI.getTimeTF().getText();
                    String location = GUI.getLocationTF().getText();
                    String issuedby = GUI.getIssuedByTF().getText();
                    

                    
                    
                    if(GUI.getBox1().isSelected())
                        violation = GUI.getViolation1();
                    if(GUI.getBox2().isSelected())
                        violation = GUI.getViolation2();
                    if(GUI.getBox3().isSelected())
                        violation = GUI.getViolation3();
                    if(GUI.getBox4().isSelected())
                        violation = GUI.getViolation4();
                    if(GUI.getBox5().isSelected())
                        violation = GUI.getViolation5();
                    if(GUI.getBox6().isSelected())
                        violation = GUI.getViolation6();
                    if(GUI.getBox7().isSelected())
                        violation = GUI.getViolation7();
                    if(GUI.getBox8().isSelected())
                        violation = GUI.getViolation8();
                    
                    
                    
                    ticket currentTicket = new ticket(licenseNo, state, permitNo, vehicle, color, violation, date, time, location, issuedby);
                    TicketModel.setCurrentTicket(currentTicket);
                    GUI.clearFields();
                }
                }
      
      );
      
      GUI.getFeedbackSubmitBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    GUI.getFeedbackTA().clear();
                }
                }
      
      );
      /******************************************
      *   feedback submit button eventhandler   *
      ******************************************/        
      GUI.getClearViewBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    GUI.getViewTA().clear();
                }
                }
      
      );
      
       
    }
    
    
}
