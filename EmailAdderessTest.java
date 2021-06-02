import org.junit.Assert;
import org.junit.Test;

public class EmailAdderessTest {

    //Test for checking Email Id
    @Test
    public void givenEmailId_is_true() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validEmailId("abcABF123@bridgelabz.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailId1_is_true() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validEmailId("abcxyj@fhjn.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailId2_is_True() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validEmailId("shra@gmail.com.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailId3_is_False() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validEmailId("400fhjj#hjfg");
        Assert.assertEquals(true, result);
    }

}
