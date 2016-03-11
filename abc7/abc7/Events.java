
/**
 * Write a description of class Events here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

   import java.util.*;
   
public class Events
{
     
    private TreeMap<String,Event> events;
    
    /**
     * Constructor for objects of class Users
     */
    public Events()
    {
        // initialise instance variables
        events = new TreeMap<String,Event>();
    }

    public Event getEvent(String e_id)
    {
       return events.get(e_id);
    }
    
    public void add_event(Event event)
    {
        events.put(event.getEvent_id(),event);
    }

    public void remove_event(Event event)
    {
        events.remove(event.getEvent_id());
    }

    public void display()
    {
        System.out.println( " "  );
         System.out.println( " "  );
        
        Iterator<Event> itr = events.values().iterator();
        while(itr.hasNext())
        {
            Event event=itr.next();
            event.display();
        }
    }
    
}
