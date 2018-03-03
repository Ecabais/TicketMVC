package citation;


import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author elyvic
 */
public class ticketGUI extends BorderPane {
    private BorderPane root = new BorderPane();
    private GridPane gridpane = new GridPane();

    //labels and image for the tile setTop  
    private Label titleLabel = new Label("Parking Citation");
    private Image myImage = new Image("TSClogo.PNG");
    private ImageView imageIV = new ImageView(myImage);
    
    //labels and textArea for feedback SetBottom
    private Label feedbackLabel = new Label("Feedback");
    private TextArea feedbackTA = new TextArea();
    
    //label for payment info setLeft
    private Label paymentInfoLabel = new Label("Payment Information");
    private Label paymentTextLabel = new Label("Payments can be made at the following office\n"
                             +"Business Office Tandy 107\n"
                             +"Monday thru Friday: 8:00 am - 5:00 pm\n"
                             +"$25 per citation, other fees may apply\n"
                             +"$100 for boot removal\n"
                                + "\n"
                             +"Payments can be mailed to the following address:\n"
                            + "TSC\n"
                            + "C/O Finance Dept\n"
                            + "Attn: Parking Enforcement\n"
                            + "80 Fort Brown\n"
                            + "Brownsville, TX 78520\n"
                            + "\n"
                            + "DO NOT MAIL CASH!\n"
                            + "For more Information on parking citations please visit:\n"
                            + "www.tsc.edu/parking");
    
    //label for view setLeft
    private TextArea viewTA = new TextArea();
    
    
    /********************************
    *   form labels and textfield   *
    ********************************/
    private Label licenseLabel = new Label("License Number");
    private TextField licenseTF = new TextField();
    
    private Label stateLabel = new Label("State");
    private TextField stateTF = new TextField();
    
    private Label permitLabel = new Label("Permit Number");
    private TextField permitTF = new TextField();
    
    private Label vehicleLabel = new Label("Vehicle Model/Type");
    private TextField vehicleTF = new TextField();
    
    private Label colorLabel = new Label("Color");
    private TextField colorTF = new TextField();
    
    private Label dateLabel = new Label("Date");
    private TextField dateTF = new TextField();
    
    private Label timeLabel = new Label("Time");
    private TextField timeTF = new TextField();
    
    private Label locationLabel = new Label("Location");
    private TextField locationTF = new TextField();
    
    private Label issuedByLabel = new Label("Issued By");
    private TextField issuedByTF = new TextField();
    
    private Label ViolationLabel = new Label("Violation");
    
    private String violation1 = "vehicle has no Permit";
    private String violation2 = "Parked in no Parking Area/Space";
    private String violation3 = "Parked in Fire Lane";
    private String violation4 = "Parked in Handicap Space";
    private String violation5 = "Parked Reserved or Assigned Space";
    private String violation6 = "Blocking Driveway, Access, or Other Vehicle";
    private String violation7 = "Parked in 2 spaces";
    private String violation8 = "Expired Meter";
    
    //checkboxes
    private CheckBox box1 = new CheckBox(violation1);
    private CheckBox box2 = new CheckBox(violation2);
    private CheckBox box3 = new CheckBox(violation3);
    private CheckBox box4 = new CheckBox(violation4);
    private CheckBox box5 = new CheckBox(violation5);
    private CheckBox box6 = new CheckBox(violation6);
    private CheckBox box7 = new CheckBox(violation7);
    private CheckBox box8 = new CheckBox(violation8);
     
    
    //All Buttons
    private Button submitBtn = new Button("Submit");
    private Button viewBtn = new Button("View All");
    private Button feedbackSubmitBtn = new Button("Submit");
    private Button clearViewBtn = new Button("Clear");
    private Button nextBtn = new Button(">>");
    private Button previousBtn = new Button("<<");
    
    private HBox arrowBtnHbox = new HBox(previousBtn, nextBtn);
    
    //all VBox
    private VBox LicensenoVBox = new VBox(licenseLabel, licenseTF);
    private VBox StateVBox = new VBox(stateLabel, stateTF);
    private VBox PermitVBox = new VBox(permitLabel, permitTF);
    private VBox vehicleVBox = new VBox(vehicleLabel, vehicleTF);
    private VBox colorVBox = new VBox(colorLabel, colorTF);
    private VBox dateVBox = new VBox(dateLabel, dateTF);
    private VBox timeVBox = new VBox(timeLabel, timeTF);
    private VBox locationVBox = new VBox(locationLabel, locationTF);
    private VBox issuedByVBox = new VBox(issuedByLabel, issuedByTF);
    private VBox checkboxVbox = new VBox(ViolationLabel,box1, box2, box3, box4, box5, box6, box7, box8);
    private VBox viewBtnVbox = new VBox(viewBtn, clearViewBtn, nextBtn, previousBtn);
 
    private VBox feedbackVBox = new VBox(feedbackLabel, feedbackTA, feedbackSubmitBtn); 
    private VBox paymentInfoVbox = new VBox(paymentInfoLabel, paymentTextLabel);
    
    //all Hbox
    private HBox titleHBox = new HBox(getImageIV(), getTitleLabel());
    private HBox viewVbox = new HBox(viewBtnVbox, viewTA);
    
    /***************
    *  Constructor *
    ***************/
    public ticketGUI(){
    
        //modifications for setCenter
        gridpane.setVgap(15);
        gridpane.setHgap(15);
        gridpane.setAlignment(Pos.CENTER);
        
        //fonts and size
        licenseLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        stateLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        permitLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        vehicleLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        colorLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        ViolationLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        dateLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        timeLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        locationLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        issuedByLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        
        box1.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box2.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box3.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box4.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box5.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box6.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box7.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box8.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        
        
        /*************************
        *  gridpane positioning  *
        *************************/
        gridpane.addRow(0,LicensenoVBox);
        gridpane.addRow(0, StateVBox);
        gridpane.addRow(0, PermitVBox);
        gridpane.addRow(1, vehicleVBox);
        gridpane.addRow(1, colorVBox);
        gridpane.addRow(2, checkboxVbox);
        gridpane.addRow(3, dateVBox);
        gridpane.addRow(4, timeVBox);
        gridpane.addRow(3, locationVBox);
        gridpane.addRow(4, issuedByVBox);
        gridpane.addRow(5, submitBtn);
        

        
        
        

        //setLeft of borderpane
        viewTA.setEditable(false);
        viewTA.setPrefHeight(300);
        viewTA.setPrefWidth(400);
        
        
        //modification setTop of borderpane
        imageIV.setFitHeight(64); //image height
        imageIV.setFitWidth(64); //image width
        
        titleHBox.setAlignment(Pos.CENTER); //alignment to the middle of the top
        
        titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40)); //font and size
       
       //modification of setRight of the borderpane.
       paymentInfoLabel.setFont(Font.font("Times New Roman", FontWeight.MEDIUM, 20));
       paymentTextLabel.setFont(Font.font("Times New Roman", FontWeight.MEDIUM, 16));
        
        /*
        Positions on the borderpane
        */
     
        this.setTop(titleHBox);
        this.setBottom(feedbackVBox);
        this.setLeft(viewVbox);
        this.setCenter(gridpane);
        this.setRight(paymentInfoVbox);
           
    
    }
    
    	
    
    /*****************************
     * updateTicketGUI function  *
     ****************************/
   
    public void updateTicketGUIAll(ArrayList<ticket> allTicket){
        
        String licenseNo = "";
        String state = "";
        String permitNo = "";
        String vehicle  = "";
        String color = "";
        String date = "";
        String violation = "";
        String time = "";
        String location = "";
        String issuedby = "";
        String allticket = "";
            
        for (int i = 0; i < allTicket.size(); i++)
        {
            ticket current = (ticket) allTicket.get(i);
            
            licenseNo = current.getLicenseNo();
            state = current.getState();
            permitNo =  current.getPermitNo();
            vehicle  = current.getVehicle();
            color = current.getColor();
            date = current.getDate();
            violation = current.getViolation();
            time = current.getTime();
            location = current.getLocation();
            issuedby = current.getIssuedby();
            
            //show everything in the DataBase
            allticket += licenseNo + "\n" + state + "\n" + permitNo + "\n" + vehicle + "\n" + color + "\n" + violation + "\n" + date + "\n" + time + "\n" + location + "\n" + issuedby + "\n\n"; 
        }
        
        
        gridpane.getChildren().clear();
        gridpane.addRow(0,LicensenoVBox); 
        gridpane.addRow(0, StateVBox);
        gridpane.addRow(0, PermitVBox);
        gridpane.addRow(1, vehicleVBox);
        gridpane.addRow(1, colorVBox);
        gridpane.addRow(2, ViolationLabel);
        gridpane.addRow(3, checkboxVbox);
        gridpane.addRow(4, dateVBox);
        gridpane.addRow(5, timeVBox);
        gridpane.addRow(4, locationVBox);
        gridpane.addRow(5, issuedByVBox);
        gridpane.addRow(6, submitBtn);
        
        viewTA.setText(allticket);
        
        
       
    }
    
    /*************************
    *  clearFields function  *
    *************************/
    
    public void clearFields()
    {
        licenseTF.clear();
        stateTF.clear();
        permitTF.clear();
        vehicleTF.clear();
        colorTF.clear();
        dateTF.clear();
        timeTF.clear();
        locationTF.clear();
        issuedByTF.clear();
        
    }
    
    public void invalidTicketPrevious(){
        
    }

    
    
    /**********************
    * setters and getters *
    **********************/

    /**
     * @return the root
     */
    public BorderPane getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(BorderPane root) {
        this.root = root;
    }

    /**
     * @return the titleLabel
     */
    public Label getTitleLabel() {
        return titleLabel;
    }

    /**
     * @param titleLabel the titleLabel to set
     */
    public void setTitleLabel(Label titleLabel) {
        this.titleLabel = titleLabel;
    }

    /**
     * @return the myImage
     */
    public Image getMyImage() {
        return myImage;
    }

    /**
     * @param myImage the myImage to set
     */
    public void setMyImage(Image myImage) {
        this.myImage = myImage;
    }

    /**
     * @return the imageIV
     */
    public ImageView getImageIV() {
        return imageIV;
    }

    /**
     * @param imageIV the imageIV to set
     */
    public void setImageIV(ImageView imageIV) {
        this.imageIV = imageIV;
    }

    /**
     * @return the feedbackLabel
     */
    public Label getFeedbackLabel() {
        return feedbackLabel;
    }

    /**
     * @param feedbackLabel the feedbackLabel to set
     */
    public void setFeedbackLabel(Label feedbackLabel) {
        this.feedbackLabel = feedbackLabel;
    }

    /**
     * @return the feedbackTA
     */
    public TextArea getFeedbackTA() {
        return feedbackTA;
    }

    /**
     * @param feedbackTA the feedbackTA to set
     */
    public void setFeedbackTA(TextArea feedbackTA) {
        this.feedbackTA = feedbackTA;
    }

    /**
     * @return the paymentInfoLabel
     */
    public Label getPaymentInfoLabel() {
        return paymentInfoLabel;
    }

    /**
     * @param paymentInfoLabel the paymentInfoLabel to set
     */
    public void setPaymentInfoLabel(Label paymentInfoLabel) {
        this.paymentInfoLabel = paymentInfoLabel;
    }

    /**
     * @return the paymentInfoTA
     */


    /**
     * @return the viewTA
     */
    public TextArea getViewTA() {
        return viewTA;
    }

    /**
     * @param viewTA the viewTA to set
     */
    public void setViewTA(TextArea viewTA) {
        this.viewTA = viewTA;
    }

    /**
     * @return the licenseLabel
     */
    public Label getLicenseLabel() {
        return licenseLabel;
    }

    /**
     * @param licenseLabel the licenseLabel to set
     */
    public void setLicenseLabel(Label licenseLabel) {
        this.licenseLabel = licenseLabel;
    }

    /**
     * @return the licenseTF
     */
    public TextField getLicenseTF() {
        return licenseTF;
    }

    /**
     * @param licenseTF the licenseTF to set
     */
    public void setLicenseTF(TextField licenseTF) {
        this.licenseTF = licenseTF;
    }

    /**
     * @return the stateLabel
     */
    public Label getStateLabel() {
        return stateLabel;
    }

    /**
     * @param stateLabel the stateLabel to set
     */
    public void setStateLabel(Label stateLabel) {
        this.stateLabel = stateLabel;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF() {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    /**
     * @return the permitLabel
     */
    public Label getPermitLabel() {
        return permitLabel;
    }

    /**
     * @param permitLabel the permitLabel to set
     */
    public void setPermitLabel(Label permitLabel) {
        this.permitLabel = permitLabel;
    }

    /**
     * @return the permitTF
     */
    public TextField getPermitTF() {
        return permitTF;
    }

    /**
     * @param permitTF the permitTF to set
     */
    public void setPermitTF(TextField permitTF) {
        this.permitTF = permitTF;
    }

    /**
     * @return the vehicleLabel
     */
    public Label getVehicleLabel() {
        return vehicleLabel;
    }

    /**
     * @param vehicleLabel the vehicleLabel to set
     */
    public void setVehicleLabel(Label vehicleLabel) {
        this.vehicleLabel = vehicleLabel;
    }

    /**
     * @return the vehicleTF
     */
    public TextField getVehicleTF() {
        return vehicleTF;
    }

    /**
     * @param vehicleTF the vehicleTF to set
     */
    public void setVehicleTF(TextField vehicleTF) {
        this.vehicleTF = vehicleTF;
    }

    /**
     * @return the colorLabel
     */
    public Label getColorLabel() {
        return colorLabel;
    }

    /**
     * @param colorLabel the colorLabel to set
     */
    public void setColorLabel(Label colorLabel) {
        this.colorLabel = colorLabel;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF() {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    /**
     * @return the dateLabel
     */
    public Label getDateLabel() {
        return dateLabel;
    }

    /**
     * @param dateLabel the dateLabel to set
     */
    public void setDateLabel(Label dateLabel) {
        this.dateLabel = dateLabel;
    }

    /**
     * @return the dateTF
     */
    public TextField getDateTF() {
        return dateTF;
    }

    /**
     * @param dateTF the dateTF to set
     */
    public void setDateTF(TextField dateTF) {
        this.dateTF = dateTF;
    }

    /**
     * @return the timeLabel
     */
    public Label getTimeLabel() {
        return timeLabel;
    }

    /**
     * @param timeLabel the timeLabel to set
     */
    public void setTimeLabel(Label timeLabel) {
        this.timeLabel = timeLabel;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF() {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    /**
     * @return the locationLabel
     */
    public Label getLocationLabel() {
        return locationLabel;
    }

    /**
     * @param locationLabel the locationLabel to set
     */
    public void setLocationLabel(Label locationLabel) {
        this.locationLabel = locationLabel;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF() {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    /**
     * @return the issuedByLabel
     */
    public Label getIssuedByLabel() {
        return issuedByLabel;
    }

    /**
     * @param issuedByLabel the issuedByLabel to set
     */
    public void setIssuedByLabel(Label issuedByLabel) {
        this.issuedByLabel = issuedByLabel;
    }

    /**
     * @return the issuedByTF
     */
    public TextField getIssuedByTF() {
        return issuedByTF;
    }

    /**
     * @param issuedByTF the issuedByTF to set
     */
    public void setIssuedByTF(TextField issuedByTF) {
        this.issuedByTF = issuedByTF;
    }

    /**
     * @return the ViolationLabel
     */
    public Label getViolationLabel() {
        return ViolationLabel;
    }

    /**
     * @param ViolationLabel the ViolationLabel to set
     */
    public void setViolationLabel(Label ViolationLabel) {
        this.ViolationLabel = ViolationLabel;
    }

    /**
     * @return the box1
     */
    public CheckBox getBox1() {
        return box1;
    }

    /**
     * @param box1 the box1 to set
     */
    public void setBox1(CheckBox box1) {
        this.box1 = box1;
    }

    /**
     * @return the box2
     */
    public CheckBox getBox2() {
        return box2;
    }

    /**
     * @param box2 the box2 to set
     */
    public void setBox2(CheckBox box2) {
        this.box2 = box2;
    }

    /**
     * @return the box3
     */
    public CheckBox getBox3() {
        return box3;
    }

    /**
     * @param box3 the box3 to set
     */
    public void setBox3(CheckBox box3) {
        this.box3 = box3;
    }

    /**
     * @return the box4
     */
    public CheckBox getBox4() {
        return box4;
    }

    /**
     * @param box4 the box4 to set
     */
    public void setBox4(CheckBox box4) {
        this.box4 = box4;
    }

    /**
     * @return the box5
     */
    public CheckBox getBox5() {
        return box5;
    }

    /**
     * @param box5 the box5 to set
     */
    public void setBox5(CheckBox box5) {
        this.box5 = box5;
    }

    /**
     * @return the box6
     */
    public CheckBox getBox6() {
        return box6;
    }

    /**
     * @param box6 the box6 to set
     */
    public void setBox6(CheckBox box6) {
        this.box6 = box6;
    }

    /**
     * @return the box7
     */
    public CheckBox getBox7() {
        return box7;
    }

    /**
     * @param box7 the box7 to set
     */
    public void setBox7(CheckBox box7) {
        this.box7 = box7;
    }

    /**
     * @return the box8
     */
    public CheckBox getBox8() {
        return box8;
    }

    /**
     * @param box8 the box8 to set
     */
    public void setBox8(CheckBox box8) {
        this.box8 = box8;
    }

    /**
     * @return the submitBtn
     */
    public Button getSubmitBtn() {
        return submitBtn;
    }

    /**
     * @param submitBtn the submitBtn to set
     */
    public void setSubmitBtn(Button submitBtn) {
        this.submitBtn = submitBtn;
    }

    /**
     * @return the viewBtn
     */
    public Button getViewBtn() {
        return viewBtn;
    }

    /**
     * @param viewBtn the viewBtn to set
     */
    public void setViewBtn(Button viewBtn) {
        this.viewBtn = viewBtn;
    }

    /**
     * @return the feedbackSubmitBtn
     */
    public Button getFeedbackSubmitBtn() {
        return feedbackSubmitBtn;
    }

    /**
     * @param feedbackSubmitBtn the feedbackSubmitBtn to set
     */
    public void setFeedbackSubmitBtn(Button feedbackSubmitBtn) {
        this.feedbackSubmitBtn = feedbackSubmitBtn;
    }

    /**
     * @return the clearViewBtn
     */
    public Button getClearViewBtn() {
        return clearViewBtn;
    }

    /**
     * @param clearViewBtn the clearViewBtn to set
     */
    public void setClearViewBtn(Button clearViewBtn) {
        this.clearViewBtn = clearViewBtn;
    }

    /**
     * @return the violation1
     */
    public String getViolation1() {
        return violation1;
    }

    /**
     * @param violation1 the violation1 to set
     */
    public void setViolation1(String violation1) {
        this.violation1 = violation1;
    }

    /**
     * @return the violation2
     */
    public String getViolation2() {
        return violation2;
    }

    /**
     * @param violation2 the violation2 to set
     */
    public void setViolation2(String violation2) {
        this.violation2 = violation2;
    }

    /**
     * @return the violation3
     */
    public String getViolation3() {
        return violation3;
    }

    /**
     * @param violation3 the violation3 to set
     */
    public void setViolation3(String violation3) {
        this.violation3 = violation3;
    }

    /**
     * @return the violation4
     */
    public String getViolation4() {
        return violation4;
    }

    /**
     * @param violation4 the violation4 to set
     */
    public void setViolation4(String violation4) {
        this.violation4 = violation4;
    }

    /**
     * @return the violation5
     */
    public String getViolation5() {
        return violation5;
    }

    /**
     * @param violation5 the violation5 to set
     */
    public void setViolation5(String violation5) {
        this.violation5 = violation5;
    }

    /**
     * @return the violation6
     */
    public String getViolation6() {
        return violation6;
    }

    /**
     * @param violation6 the violation6 to set
     */
    public void setViolation6(String violation6) {
        this.violation6 = violation6;
    }

    /**
     * @return the violation7
     */
    public String getViolation7() {
        return violation7;
    }

    /**
     * @param violation7 the violation7 to set
     */
    public void setViolation7(String violation7) {
        this.violation7 = violation7;
    }

    /**
     * @return the violation8
     */
    public String getViolation8() {
        return violation8;
    }

    /**
     * @param violation8 the violation8 to set
     */
    public void setViolation8(String violation8) {
        this.violation8 = violation8;
    }

    /**
     * @return the nextBtn
     */
    public Button getNextBtn() {
        return nextBtn;
    }

    /**
     * @param nextBtn the nextBtn to set
     */
    public void setNextBtn(Button nextBtn) {
        this.nextBtn = nextBtn;
    }

    /**
     * @return the previousBtn
     */
    public Button getPreviousBtn() {
        return previousBtn;
    }

    /**
     * @param previousBtn the previousBtn to set
     */
    public void setPreviousBtn(Button previousBtn) {
        this.previousBtn = previousBtn;
    }
}
