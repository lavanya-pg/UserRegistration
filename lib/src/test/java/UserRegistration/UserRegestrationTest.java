package UserRegistration;

import org.junit.Assert;
import org.junit.Test;
public class UserRegestrationTest
{

	UserRegistration user = new UserRegistration();

     @Test
     public void FirstName_ShouldReturnTrue_LetterShouldBeUpperCase() 
     {
    	boolean result = user.validateFirstName("Lavanya");
    	Assert.assertTrue(result);
	 }
     @Test
     public void FirstName_ShouldReturnFalse_LetterShouldLessThanThreeChar()
     {
    	 boolean result = user.validateFirstName("La");
    	 Assert.assertFalse(result);
     }

     @Test
 	 public void FirstName_ShouldReturnFalse_ItHasNumber() 
     {
 		boolean result = user.validateFirstName("Lavi8");
 		Assert.assertFalse(result);
 	 }

     @Test
     public void FirstName_ShouldReturnFalse_ItHasSpecialCharacter() 
     {
    	 boolean result = user.validateFirstName("Lavi!");
    	 Assert.assertFalse(result);
     }
}
