import java.util.*;

/**
* Write a description of class User here.
*
* @author (your name)
* @version (a version number or a date)
*/

//import java.util.Date;

public class User
{
    private String user_id;
    private String password;
    private String u_fname;
    private String u_lname;
    private Date u_DOB;
    private String u_mailid;
    private String u_sex;
    private String u_mobileno;
   // private Boolean isAdmin;
   private Address u_address;
    private int day;
    private String Month_name;
    private int year;
    private int hour;
    private int minute;
        
   
  private  Calendar cal = Calendar.getInstance();
  
    /**
    * Constructor for objects of class User
    */
   /*public User()
    {
        // initialise instance variables
      
    }*/
    
    public User(String user_id, String password)
    {
        this.user_id = user_id;
        this.password = password;
    }    
   
   
   public String getUser_id()
    {
        return user_id;
    }

    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getFirst_name()
    {
        return u_fname;
    }

    public void setFirst_name(String u_fname)
    {
        this.u_fname = u_fname;
    }
    
    public String getLast_name()
    {
        return u_lname;
    }

    public void setLast_name(String u_lname)
    {
        this.u_lname = u_lname;
    }
   
    public Address getADDRESS()
    {
        return u_address;
    }
    
    public void setADDRESS( Address u_address )
    {
        this.u_address = u_address;
    }
    
    public Date getDOB()
    {
        return u_DOB;
    }
    
    public void setDOB(Date u_DOB)
    {
        this.u_DOB = u_DOB;
    }
    
    public String getMailid()
    {
        return u_mailid;
    }
    
    public void setMailid(String u_mailid)
    {
        this.u_mailid = u_mailid;
    }
    
    public String getMobile_no()
    {
        return u_mobileno;
    }
    
    public void setMobile_no(String u_mobileno)
    {
        this.u_mobileno = u_mobileno;
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
    
    public String getSex()
    {
        return u_sex;
    }

    public void setSex(String u_sex)
    {
        this.u_sex = u_sex;
    }
    
    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
    
    /*
    public Boolean getStatus()
    {
        return isAdmin;
    }
    
    public void setStatus(Date u_DOB)
    {
        this.isAdmin = isAdmin;
    }*/
    
  /*

    public void CalendarDemo()
    {

   System.out.println("Current year is :" + cal.getTime());

   // set the year,month and day to something else
   cal.set(1995, 5, 25);

   // print the result
   System.out.println("Altered year is :" + cal.getTime()); 
   
  }
    
  public class Date
{
   
  
    public Date()
    {
        // initialise instance variables
       
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

  */
  
    public void display()
    {
        //Address address = new Address();
        System.out.println( getUser_id() + " " + 
        getPassword() + " " +
        getFirst_name() + " " +
        getLast_name() + " " +
        getSex() + " " +
        getMailid() + " " +
        getMobile_no() );
       
       u_address.display();
       
       u_DOB.display_date();
               
    }
   
        

}
