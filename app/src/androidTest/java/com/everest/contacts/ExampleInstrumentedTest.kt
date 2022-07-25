package com.everest.contacts

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val rule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun should_display_values_in_second_activity() {
        //enter the text
        onView(withId(R.id.contactNameOne)).perform(typeText("wenkey"), closeSoftKeyboard())
        onView(withId(R.id.contactNumberOne)).perform(typeText("1234"), closeSoftKeyboard())
        onView(withId(R.id.contactNameTwo)).perform(typeText("muni"), closeSoftKeyboard())
        onView(withId(R.id.contactNumberTwo)).perform(typeText("45678"), closeSoftKeyboard())

        //button is clicked
        onView(withId(R.id.save_button)).perform(click())

        //No need to tell espresso, while activity is changed
        onView(withId(R.id.contactName1)).check(matches(withText("wenkey")))
        onView(withId(R.id.phoneNumber1)).check(matches(withText("1234")))
        onView(withId(R.id.contactName2)).check(matches(withText("muni")))
        onView(withId(R.id.phoneNumber2)).check(matches(withText("45678")))
    }


}