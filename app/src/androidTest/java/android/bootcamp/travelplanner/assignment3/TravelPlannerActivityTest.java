package android.bootcamp.travelplanner.assignment3;


import android.bootcamp.travelplanner.TravelPlannerActivity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class TravelPlannerActivityTest {


    @Rule
    public ActivityTestRule<TravelPlannerActivity> activityTestRule =
            new ActivityTestRule<>(TravelPlannerActivity.class);

    @Test
    public void addBufferToTimeAndShowItOnTheFirstPage() {
        onView(withId(android.bootcamp.travelplanner.R.id.distance)).perform(typeText("400"));
        onView(withId(android.bootcamp.travelplanner.R.id.velocity)).perform(typeText("20"));

        onView(withId(android.bootcamp.travelplanner.R.id.calculate)).perform(click());

        onView(android.support.test.espresso.matcher.ViewMatchers.withId(android.bootcamp.travelplanner.R.id.buffer)).perform(typeText("8"));

        onView(android.support.test.espresso.matcher.ViewMatchers.withId(android.bootcamp.travelplanner.R.id.calculate_with_buffer)).perform(click());
        onView(android.support.test.espresso.matcher.ViewMatchers.withId(android.bootcamp.travelplanner.R.id.time_with_buffer)).check(matches(withText(("Value with buffer = 28"))));

    }
}