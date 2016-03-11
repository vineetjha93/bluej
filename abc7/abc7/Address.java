/**
* Write a description of class Address here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Address
{
    private String House_name;
    private String Street1;
    private String Street2;
    private long Pincode;
    private String City;
    private String Country;

    /**
    * Constructor for objects of class Address
    */
    public Address()
    {
        // initialise instance variables
       
    }

    
   public String getHouse_name()
    {
        return House_name;
    }

    public void setHouse_name(String House_name)
    {
        this.House_name = House_name;
    }

    public String getStreet1()
    {
        return Street1;
    }

    public void setStreet1(String Street1)
    {
        this.Street1 = Street1;
    }
    
    public String getStreet2()
    {
        return Street2;
    }

    public void setStreet2(String Street2)
    {
        this.Street2 = Street2;
    }
    
    public long getPincode()
    {
        return Pincode;
    }

    public void setPincode(long Pincode)
    {
        this.Pincode = Pincode;
    }
 
    public String getCity()
    {
        return City;
    }
    
    public void setCity(String City)
    {
        this.City = City;
    }
    
    public String getCountry()
    {
        return Country;
    }
    
    public void setCountry(String Country)
    {
        this.Country = Country;
    }
    
   
    
    public void display()
    {
        System.out.println( getHouse_name() + " " + 
        getStreet1() + " " +
        getStreet2() + " " +
        getPincode() + " " +
        getCity() + " " +
        getCountry());
        
        
    }
}
