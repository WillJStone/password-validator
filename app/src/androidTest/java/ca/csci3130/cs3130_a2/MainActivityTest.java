package ca.csci3130.cs3130_a2;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by mrbeerslaw on 07/02/18.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private String testPass  = "myPassword^1";
    private String testFail  = "foobar";
    private String testFail2 = "Password";
    private String passMsg   = "Strong Password";
    private String failMsg   = "Try Another Password!";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGoodPassword(){
        // input a test password
        Espresso.onView(withId(R.id.password_editText)).perform(typeText(testPass));
        // close keyboard
        Espresso.closeSoftKeyboard();
        // click submit button
        Espresso.onView(withId(R.id.submitBtn)).perform(click());
        // check the text in the textView
        Espresso.onView(withId(R.id.strengthIndicator)).check(matches(withText(passMsg)));
    }

    @Test
    public void testBadPassword1(){
        Espresso.onView(withId(R.id.password_editText)).perform(typeText(testFail));
        // close keyboard
        Espresso.closeSoftKeyboard();
        // click submit button
        Espresso.onView(withId(R.id.submitBtn)).perform(click());
        // check the text in the textView
        Espresso.onView(withId(R.id.strengthIndicator)).check(matches(withText(failMsg)));
    }

    @Test
    public void testBadPassword2(){
        Espresso.onView(withId(R.id.password_editText)).perform(typeText(testFail2));
        // close keyboard
        Espresso.closeSoftKeyboard();
        // click submit button
        Espresso.onView(withId(R.id.submitBtn)).perform(click());
        // check the text in the textView
        Espresso.onView(withId(R.id.strengthIndicator)).check(matches(withText(failMsg)));
    }

    @After
    public void tearDown() throws Exception {
    }

}