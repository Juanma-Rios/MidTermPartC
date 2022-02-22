package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class TestUserProfile
{
   public static void main (String[] args)
   {
      System.out.println("Let's create a profile.\n");
      String choName;
      String favGenre;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your name: ");
      choName = input.next();
      System.out.println("Enter your favorite music genre: ");
      favGenre = input.next();
      UserProfile newUser = new UserProfile(choName, favGenre);
      System.out.println("\nProfile Created! \nID: " + newUser.getUserID() + "\nFavorite Genre: " + newUser.getGenre());
   }
}
