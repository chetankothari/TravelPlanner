package android.bootcamp.travelplanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class TravelPlannerActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_project_planner);
  }

  public void calculate(View view) {
    TextView result = (TextView) findViewById(R.id.number_of_iterations);
    result.setText("25");
  }
}
