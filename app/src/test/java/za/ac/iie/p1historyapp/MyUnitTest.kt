package za.ac.iie.p1historyapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testGenerateTextButton() {
        onView(withId(R.id.enterAge)).perform(typeText("15")) // Input age
        onView(withId(R.id.generateFactButton)).perform(click()) // Click the generate button
        onView(withId(R.id.message)).check(matches(withText("Annelies Marie Frank (Anne Frank) died at 16."))) // Check if correct message is displayed
    }

    @Test
    fun testClearButton() {
        onView(withId(R.id.enterAge)).perform(typeText("25")) // Input age
        onView(withId(R.id.generateFactButton)).perform(click()) // Click the generate button
        onView(withId(R.id.clearButton)).perform(click()) // Click the clear button
        onView(withId(R.id.message)).check(matches(withText(""))) // Check if text view is cleared
    }

    @Test
    fun testInvalidInput() {
        onView(withId(R.id.enterAge)).perform(typeText("abc")) // Input invalid text
        onView(withId(R.id.generateFactButton)).perform(click()) // Click the generate button
        onView(withId(R.id.message)).check(matches(withText("Invalid input!"))) // Check if correct message for invalid input is displayed
    }
}