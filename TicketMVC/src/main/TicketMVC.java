package main;

import citation.ticketController;
import citation.ticketGUI;
import citation.ticketModel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author elyvic
 */
public class TicketMVC extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
        
        ticketGUI GUI = new ticketGUI();
        ticketModel TicketModel = new ticketModel();
        ticketController controller = new ticketController(TicketModel, GUI);
        
        
        Scene scene = new Scene(GUI, 1450, 800);
        
        primaryStage.setTitle("Ticket Citation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
