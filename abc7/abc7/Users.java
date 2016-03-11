import java.util.*;

public class Users
{
   private TreeMap<String,User> users;
    
    /**
     * Constructor for objects of class Users
     */
    public Users()
    {
        // initialise instance variables
        users = new TreeMap<String,User>();
    }

    public User getUser(String user_id)
    {
       return users.get(user_id);
    }
    
    public void add_user(User user)
    {
        users.put(user.getUser_id(),user);
    }
    
    public void remove_user(User user)
    {
        users.remove(user.getUser_id());
    }

    public void display()
    {
        System.out.println( " "  );
         System.out.println( " "  );
        
        Iterator<User> itr = users.values().iterator();
        while(itr.hasNext())
        {
            User user=itr.next();
            user.display();
        }
    }
    

    
   
}
