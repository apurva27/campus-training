public class FactoryPatternDemo {

   public static void main(String[] args) {
      LoginFactory loginFactory = new LoginFactory();

      LoginFirst Login1 = loginFactory.login("FACEBOOK");
      Login1.loginn();

      LoginFirst Login2 = loginFactory.login("GOOGLE");
      Login2.loginn();

      LoginFirst Login3 = loginFactory.login("LINKEDIN");
      Login3.loginn();
   }
}