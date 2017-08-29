/**
 * A Vehicle.
 * Vehicles have a unique ID.
 * 
 * @author Erick de O. Silva 
 * @version 2017.08.29
 */
public class Vehicle
{
	// A unique ID for this vehicle.
    private String id;

    /**
     * Constructor for objects of class Taxi.
     * @param id This vehicle's unique id.
     */
    public Vehicle( String id )
    {
    	this.id = id;
    }

    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID()
    {
        return id;
    }
    
}