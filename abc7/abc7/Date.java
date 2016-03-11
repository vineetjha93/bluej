
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
    private int day;
    private String Month_name;
    private int year;
    private int hour;
    private int minute;
  
    /**
    * Constructor for objects of class Address
    */
    public Date()
    {
        // initialise instance variables
       
    }

    
   public String getMonth_name()
    {
        return Month_name;
    }

    public void setMonth_name(String Month_name)
    {
        this.Month_name = Month_name;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }
    
    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
    
    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }
    
    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }
    
        
    public void display_date()
    {
        System.out.println( 
        getDay() + " " +
        getMonth_name() + " " + 
        getYear());     
    }
    
    public void display_time()
    {
        System.out.println( 
        getHour() + " " +
        getMinute()
        );     
    }
}
