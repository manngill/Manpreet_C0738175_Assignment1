
public class Yelling {

    public String scream(String name) {
        
       if (name == null)
       {
          return "Nobody is yelling";
       }

        if (name != null && name != name.toUpperCase()) 
        {
            return name + " is yelling";
        } 
        
         else if (name != name.toLowerCase()) 
        {
            return name + " IS YELLING";
        }
        
      
  
      return "";
    }
}
