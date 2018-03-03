package citation;

/**
 *
 * @author elyvic
 */
public class ticket {


    private String licenseNo;
    private String state;
    private String permitNo;
    private String vehicle;
    private String color;
    private String violation;
    private String date;
    private String time;
    private String location;
    private String issuedby;

    public ticket() {
    }
    
    

    public ticket(String licenseNo, String state, String permitNo, String vehicle, String color, String violation, String date, String time, String location, String issuedby) {
        this.licenseNo = licenseNo;
        this.state = state;
        this.permitNo = permitNo;
        this.vehicle = vehicle;
        this.color = color;
        this.violation = violation;
        this.date = date;
        this.time = time;
        this.location = location;
        this.issuedby = issuedby;
    }
    
    
        /**
     * @return the licenseNo
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * @param licenseNo the licenseNo to set
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the permitNo
     */
    public String getPermitNo() {
        return permitNo;
    }

    /**
     * @param permitNo the permitNo to set
     */
    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }

    /**
     * @return the vehicle
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the issuedby
     */
    public String getIssuedby() {
        return issuedby;
    }

    /**
     * @param issuedby the issuedby to set
     */
    public void setIssuedby(String issuedby) {
        this.issuedby = issuedby;
    }

    /**
     * @return the violation
     */
    public String getViolation() {
        return violation;
    }

    /**
     * @param violation the violation to set
     */
    public void setViolation(String violation) {
        this.violation = violation;
    }
}
