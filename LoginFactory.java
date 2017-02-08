public class LoginFactory {
	
   public LoginFirst login(String Social_network_name){
      if(Social_network_name == null){
         return null;
      }		
      if(Social_network_name.equalsIgnoreCase("FACEBOOK")){
         return new Facebook();
         
      } else if(Social_network_name.equalsIgnoreCase("LINKEDIN")){
         return new Linkedin();
         
      } else if(Social_network_name.equalsIgnoreCase("GOOGLE")){
         return new Google();
      }
      
      return null;
   }
}