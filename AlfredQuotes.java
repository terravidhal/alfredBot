import java.util.Date;
import java.text.SimpleDateFormat; // import class SimpleDateFormat of bibliothèque 'java.text'

public class AlfredQuotes {
    
    // public String basicGreeting() {
    //     // You do not need to code here, this is an example method
    //     return "Hello, lovely to see you. How are you?";
    // }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("\nHello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > -1){
          return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if(conversation.indexOf("Alfred") > -1){
          return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	//a- See the specs to overload the guestGreeting method
    public String guestGreeting(String name, String dayPeriod ) {
        // YOUR CODE HERE
        return String.format("\nGood %s, %s. Lovely to see you.", dayPeriod, name);
    }
    //b-SENSEI VERSION:
    public String guestGreeting() { 
        
        // YOUR CODE HERE 
        SimpleDateFormat sdf = new SimpleDateFormat("a"); //'a'  AM/PM marker
        String time = sdf.format(new Date()); 
        String dayPeriod; 
        if (time.equals("AM")) { 
            dayPeriod = "morning"; 
        } else if (time.equals("PM")) { 
            dayPeriod = "afternoon"; 
        } else { 
            dayPeriod = "evening"; 
        } 
        return String.format("\nGood %s. Lovely to see you.", dayPeriod); 
    }


    // SENSEI BONUS
    public String yellsAngry(String conversationss ) {
        // YOUR CODE HERE
        if(conversationss.indexOf("angry") > -1){
          return "ahhhhh!!!!!!!!";
        }
        return "";  
    }
}

