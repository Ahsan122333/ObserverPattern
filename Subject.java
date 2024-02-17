import java.util.ArrayList;
import java.util.List;

public class Subject {
      private List<User> users = new ArrayList<User>();
      private String state;
      public String getState()
      {
        return state;
      }
      public void setNotification(String notification){
            this.state=notification;
            notifyallobservers();
      }
      public void notifyallobservers()
      {
        for (User user : users) {
            user.notifyMe(); 
        }
      }
      public void attach (User user)
      {
        users.add(user);
      }
    }

