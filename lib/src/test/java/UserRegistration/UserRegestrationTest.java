package UserRegistration;

import org.junit.Assert;
import org.junit.Test;
public class UserRegestrationTest
{
	UserRegistration user = new UserRegistration();

     @Test
     public void FirstName_ShouldReturnTrue_LetterShouldbeUpperCase() 
     {
    	boolean result = user.validateFirstName("Lavanya");
	 	Assert.assertTrue(result);
	 }
     @Test
     public void FirstName_ShouldReturnFalse_LetterShouldLessthanThreeChar()
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
      @Test
	  public void LastName_ShouldReturnTrue_LetterShouldbeUpperCase() 
	  { 
	    boolean result = user.validateLastName("Gangadharan");
	    Assert.assertTrue(result);
	  }
	  @Test 
	  public void LastName_ShouldReturnFalse_LetterShouldLessthanThreeChar()
	  {
		boolean result = user.validateLastName("Ga");
		Assert.assertFalse(result);
	  }
	  @Test
	  public void LastName_ShouldReturnFalse_ItHasNumber() 
	  {
	      boolean result = user.validateFirstName("Gangadharan8");
	      Assert.assertFalse(result);
	  }
	  @Test
	  public void LastName_ShouldReturnFalse_ItHasSpecialCharacter()
	  {
	      boolean result = user.validateFirstName("Ganga^dharan");
	      Assert.assertFalse(result);
	  }
	  @Test
	  public void EmailId_ShouldReturnTrue_ItShouldBeProperFormat()
	  {
	        boolean result = user.validateEmailid("xyz@gdkd.com.in");
	        Assert.assertTrue(result);
	  }
}
