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
     public void ShouldReturnFalse_LetterShouldLessthanThreeChar()
     {
	 boolean result = user.validateFirstName("La");
	Assert.assertFalse(result);
    }

     @Test
 	public void FirstName_ShouldReturnFalse_ItHasNumber()
     {
 		boolean result = user.validateFirstName("Lavanya8");
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
	    @Test
		public void Password_WhenMin8Chars_ShouldReturnTrue()
	    {
			boolean result = user.validatePassword("jUy8P3&hw");
			Assert.assertTrue(result);
		}

		@Test
		public void Password_WhenAtleast1UpperCase_ShouldReturnTrue()
		{
			boolean result = user.validatePassword("5Sego!pq");
			Assert.assertTrue(result);
		}

		@Test
		public void Password_WhenAtleast1Number_ShouldReturnTrue() 
		{
			boolean result = user.validatePassword("Lsd4fk^Sl");
			Assert.assertTrue(result);
		}

		@Test
		public void Password_WhenNoNumeric_ShouldReturnFalse()
		{
			boolean result = user.validatePassword("lKk$fSH");
			Assert.assertFalse(result);
		}

		@Test
		public void Password_WhenHasExactoneSpecialChar_ShouldReturnFlase()
		{
			boolean result = user.validatePassword("lKg#ffS");
			Assert.assertFalse(result);
		}

		@Test
		public void Password_WhenNoSpecialChar_ShouldReturnFlase() 
		{
			boolean result = user.validatePassword("lKkfS6");
			Assert.assertFalse(result);
		}

		@Test
		public void Password_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() 
		{
			boolean result = user.validatePassword("lKk$f*S6");
			Assert.assertTrue(result);
		}

}
