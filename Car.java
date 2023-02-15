public class Car {
    /** Car class construction 
     * Create instance variables 
     *      private variable on miles/gallon = 0;
     *      private variable initial gallon of tank = 0;
     *      public variable number of passengers 
     * Constructor 
     *      fuel effiency 
     *      gas tank 
     *      passengers 
     * Methods 
     * - drive: insert miles going to reduce gallon tank 
     *      - drive nevers run when tank is empty 
     *      - drive certain distance in miles and gas reduce
     * - getGasLevel 
     * - addGas 
     * - setPassengers 
     * - getPassengers 
     */

    //INTANTCE VARIALBE 
    /**
     * Setting instance variable 
     * miles/Gallon set to 0  
     * Fuel tank set to 0
     * Passenger set to 0
     */
    private double milesPerGallon = 0;
    private  double fuelInTank = 0; 
    private int passengers = 0; 
    public String carName = "";
    
    //PUBLIC CONSTRUCTOR
    /**
     * Set initial car parameters 
     * @param fuelEfficiency specify fuel effiency (in miles/gallon)
     * @param name specify a flashy name for your car
     */
    public Car (int fuelEfficiency, String name){
        carName = name;
        milesPerGallon = fuelEfficiency;
        fuelInTank = 0;
        passengers = 0;
    }

    //METHODS
    /**
     * Distance the car has driven 
     * @param driveMiles Miles the car has driven 
     */
    public void drive (double driveMiles) 
    {
        double totalMilesToDrive = milesPerGallon * fuelInTank; // 1000 miles
        double consumtionPerMile = (fuelInTank/totalMilesToDrive); // 20/1000 = 0.02gal/miles
        fuelInTank = fuelInTank - (driveMiles * consumtionPerMile);
    }
    /**
     * Gets current fuel in gas tank (in gallon)
     * @return current fuel in gas tank (in gallon)
     */
    public double getGassLevel ()
    {
        return fuelInTank;
    }
    /**
     * Gets and Add gas to your tank 
     * @param amountGas the amount of gas to add
     * @return current fuel in gas tank
     */
    public double addGas (double amountGas)
    {
        fuelInTank += amountGas;
        return fuelInTank;
    }
    /**
     * Set the number of passenger for the vehicle 
     * @param numberOfPassenger the number of passenger in the vehicle
     */
    public void setPassengers (int numberOfPassenger)
    {
        passengers += numberOfPassenger;
    }
    /**
     * Gets amount of passengers 
     * @return the passengers in vehicle 
     */
    public int getPassengers () 
    {
        return passengers;
    }
}
