package android.bootcamp.travelplanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class TravelPlannerActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_travel_planner);
  }

  public void calculate(View view) {
    EditText distanceEdit = findViewById(R.id.distance);
    String distanceString = distanceEdit.getText().toString();
    int distance = Integer.parseInt(distanceString);

    EditText velocityEdit = findViewById(R.id.velocity);
    String velocityString = velocityEdit.getText().toString();
    int velocity = Integer.parseInt(velocityString);

    int time = distance / velocity;

    TextView result = findViewById(R.id.time);
    String strResult = String.valueOf(time);
    result.setText(strResult);
  }
}
