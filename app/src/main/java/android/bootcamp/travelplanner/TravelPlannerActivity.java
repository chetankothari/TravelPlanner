package android.bootcamp.travelplanner;

import android.app.Activity;
import android.bootcamp.travelplanner.databinding.ActivityTravelPlannerBinding;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TravelPlannerActivity extends Activity {

  public static final String BUFFERED_TIME = "android.bootcamp.travelplanner.BUFFERED_TIME";
  public static final int REQUEST_BUFFERED_TIME = 1;

  private ActivityTravelPlannerBinding binding;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_travel_planner);
  }

  public void calculate(View view) {
    String distanceString = binding.distance.getText().toString();
    int distance = Integer.parseInt(distanceString);

    String velocityString = binding.velocity.getText().toString();
    int velocity = Integer.parseInt(velocityString);

    int time = distance / velocity;

    TextView result = binding.time;
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
        TextView result = binding.bufferedTime;
        result.setText(data.getStringExtra(BUFFERED_TIME));
      }
    }
  }
}
