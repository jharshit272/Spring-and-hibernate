package java4s;
import java.util.ArrayList;
import java.util.List;
 
import com.opensymphony.xwork2.ActionSupport;
 
public class LogingEx extends ActionSupport{
    private static final long serialVersionUID = 1L;
 
    private List states;
 
        public List getStates()
        {
              return states;
        }
 
      public String execute() throws Exception{
      states = new ArrayList();
      states.add("Alabama");
      states.add("Alaska");
      states.add("Arizona");
      states.add("Arkansas");
      states.add("California");
      states.add("Colorado");
      states.add("Connecticut");
      states.add("Delaware");
      states.add("District of Columbia");
      states.add("Florida");
      states.add("Georgia");
      states.add("Hawaii");
      states.add("Idaho");
      states.add("Illinois");
      states.add("Indiana");
      states.add("Iowa");
      states.add("Kansas");
      states.add("Kentucky");
      states.add("Louisiana");
      states.add("Maine");
      states.add("Maryland");
      states.add("Massachusetts");
      states.add("Michigan");
      states.add("Minnesota");
      states.add("Mississippi");
      states.add("Missouri");
      states.add("Montana");
      states.add("Nebraska");
      states.add("Nevada");
      states.add("New Hampshire");
      states.add("New Jersey");
      states.add("New Mexico");
      states.add("New York");
      states.add("North Carolina");
      states.add("North Dakota");
      states.add("Ohio");
      states.add("Oklahoma");
      states.add("Oregon");
      states.add("Pennsylvania");
      states.add("Rhode Island");
      states.add("South Carolina");
      states.add("South Dakota");
      states.add("Tennessee");
      states.add("Texas");
      states.add("Utah");
      states.add("Vermont");
      states.add("Virginia");
      states.add("Washington");
      states.add("West Virginia");
      states.add("Wisconsin");
      states.add("Wyoming");
      return SUCCESS;
      }
    }