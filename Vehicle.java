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
    // A destination for this vehicle.
    private String destination;
    // A location of this vehicle.
    private String location;

    /**
     * Constructor for objects of class Vehicle.
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
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Set the location of the vehicle.
     * @param location Location of this vehicle.
     */
    public void setLocation( String location )
    {
	this.location = location;
    }

    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    /**
     * Return the status of this vehicle.
     * @return The status with next destination, If the destination isn't null. Show the status of available vehicle in Otherwise.
     */
    public String getStatus()
    {
	if( getDestination() != null )
	{ 
            return getID() + " at " + getLocation() + " headed for " +
               getDestination();
	}

	return getID() + " at " + getLocation() + " is free ";    
    }
}
