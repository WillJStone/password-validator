package ca.csci3130.cs3130_a2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test // Reject password if it is "password". Will pass lenCheck
    public void passwdCheck() throws Exception {
        assertEquals(1, Validator.validate("password"));
    }
    @Test // password at least 8 chars. Will pass passwdCheck and lenCheck
    public void lenCheck() throws Exception {
        assertEquals(2, Validator.validate("mypassword"));
    }
    @Test // Password needs a number. Will pass passwdCheck, lenCheck, and numCheck,
    public void numCheck() throws Exception {
        assertEquals(3, Validator.validate("mypassword1"));
    }
    @Test //make sure password has one upper case letter. Will pass passwdCheck, lenCheck, numCheck,
          // and caseCheck
    public void caseCheck() throws Exception {
        assertEquals(4, Validator.validate("myPassword1"));
    }
    @Test // Make sure password has special character. Will pass all 5 tests
    public void charCheck() throws Exception {
        assertEquals(5, Validator.validate("myPassword^1"));
    }
}