/**
* Write a description of class Event here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Event
{
    // instance variables - replace the example below with your own
    private String e_name;
    private Date e_time_date;
    private Address e_address;
    private String e_description;
    private String e_type;
    private String e_id;
    private User[] User;
    

    /**
    * Constructor for objects of class Event
    */
    public Event()
    {
        // initialise instance variables

    }
    
    public String getEvent_name()
    {
        return e_name;
    }

    public void setEvent_name(String e_name)
    {
        this.e_name = e_name;
    }

    public Date getTime_Date()
    {
        return e_time_date;
    }

    public void setTime_Date(Date e_time_date)
    {
        this.e_time_date = e_time_date;
    }
    
    public Address getEvent_address()
    {
        return e_address;
    }

    public void setEvent_address(Address e_address)
    {
        this.e_address = e_address;
    }
    
    public String getEvent_Description()
    {
        return e_description;
    }

    public void setEvent_Description(String e_description)
    {
        this.e_description = e_description;
    }
    
    public String getEvent_Type()
    {
        return e_type;
    }
    
    public void setEvent_Type( String e_type )
    {
        this.e_type = e_type;
    }
    
    public String getEvent_id()
    {
        return e_id;
    }
    
    public void setEvent_id( String e_id )
    {
        this.e_id = e_id;
    }
    
   public void display()
   {
       System.out.println(
       getEvent_name() + " " +
       getEvent_Description() + " " +
       getEvent_Type() + " " +
       getEvent_id());
       
       e_address.display();
       
       e_time_date.display_date();
       e_time_date.display_time();
    }
   
   
}
