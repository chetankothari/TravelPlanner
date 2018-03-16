package android.bootcamp.travelplanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class TravelPlannerActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_travel_planner);
  }

  public void calculate(View view) {
    TextView result = (TextView) findViewById(R.id.time);
    result.setText("25");
  }
}
