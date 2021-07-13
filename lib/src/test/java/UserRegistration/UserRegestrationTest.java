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
	   @Test
	   public void MobileNumber_ShouldReturnTrue_IfItHasSpacebetweenTheNumbers()
	   {
	        boolean result = user.validateMobileNum("91 9993588735");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void MobileNumber_ShouldReturnFalse_IfItHasNotSpacebetweenTheNumbers()
	    {
	        boolean result = user.validateMobileNum("919993588735");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void MobileNumber_ShouldReturnFalse_IfItHasLessdigits()
	    {
	        boolean result = user.validateMobileNum("966642173");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void MobileNumber_ShouldReturnFalse_IfItHasNotStartedWith91()
	    {
	        boolean result = user.validateMobileNum("7560984632645");
	        Assert.assertFalse(result);
	    }

}
