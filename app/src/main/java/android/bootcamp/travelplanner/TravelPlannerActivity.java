package android.bootcamp.travelplanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class TravelPlannerActivity extends Activity {

  public static final String BUFFERED_TIME = "android.bootcamp.travelplanner.BUFFERED_TIME";
  public static final int REQUEST_BUFFERED_TIME = 1;

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

    Intent intent = new Intent(this, TimeActivity.class);
    intent.putExtra(TimeActivity.TIME_RESULT, strResult);
    startActivityForResult(intent, REQUEST_BUFFERED_TIME);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == REQUEST_BUFFERED_TIME) {
      if (resultCode == RESULT_OK) {
        TextView result = findViewById(R.id.buffered_time);
        result.setText(data.getStringExtra(BUFFERED_TIME));
      }
    }
  }
}
