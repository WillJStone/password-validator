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
    @Test
    public void passwdCheck() throws Exception {
        assertEquals(1,Validator.validate("Password"));
    }
    @Test
    public void lenCheck() throws Exception {
        assertEquals(2,Validator.validate("mypassword"));

    }
}