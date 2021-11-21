package demo;

/**
 *
 * @author Group 5
 */
public class RideInfo {
    
    private String rideName; //name of the ride
    private boolean hasSeats; //yes or no for seats being available for this ride 
    private String rideDetails; // provide ride details
    private int rideCurrentCapacity; // ride's current capacity
    private int rideMaxCapacity; // ride's max capacity
    
    
    private boolean isFavoriteRide; //*Favorites user interface design addition
  
    public RideInfo(String rideName, boolean hasSeats, String rideDetails, int rideCurrentCapacity, int rideMaxCapacity, boolean isFavoriteRide){
    this.rideName = rideName;
    this.hasSeats = hasSeats; 
    this.rideDetails = rideDetails; 
    this.rideCurrentCapacity = rideCurrentCapacity; 
    this.rideMaxCapacity = rideMaxCapacity; 
    
    //*Favorites user interface design addition
    this.isFavoriteRide = isFavoriteRide; 
    
    
  }



    /** Method to determine whether seats are available or not
     * 
     * @return hasSeats
     */
    public boolean seatsAvailable(){
        
        return hasSeats; 
        
}
     /** Getter String Method to get the name of the ride
     * 
     * @return rideName
     */   
    public String getRideName(){
        
        return rideName; 
        
    }
     /** Setter Method to set the ride's name
     * 
     * @param rideName 
     */
    public void setRideName(String rideName){
        
        this.rideName = rideName; 
        
    }
    
     /** Setter Method to set the details of a ride
     * 
     * @param rideDetails
     */
    public void setRideDetails(String rideDetails){
        
        this.rideDetails = rideDetails; 
        
    }
    /** Getter String method to get the details of the ride
     * 
     * @return rideDetails
     */
    public String getRideDetails(){
        
        return rideDetails; 
        
    }
    
    /** Getter integer method to get the max capacity of a ride
     * 
     * @return rideDetails
     */
    public int getRideMaxCapacity(){
        
        return rideMaxCapacity; 
        
    }
    /** Setter Method to set the ride's max capacity
     * 
     * @param rideMaxCapacity
     */
    public void setRideMaxCapacity(int rideMaxCapacity){
        
        this.rideMaxCapacity = rideMaxCapacity; 
        
    }
    
    /** Getter integer method to get the capacity of the ride
     * 
     * @return rideCurrentCapacity
     */
    public int getRideCurrentCapacity(){
        
        return rideCurrentCapacity; 
        
    }
    
     /** Setter Method to set the details of a ride
     * 
     * @param rideCurrentCapacity
     */    
    public void setRideCurrentCapacity(int rideCurrentCapacity){
        
        this.rideCurrentCapacity = rideCurrentCapacity; 
        
    }  
    

    
    //*Favorites user interface design addition
    public boolean isFavoriteRide(){
        
        return isFavoriteRide(); 
        
    }
    
    
    
}