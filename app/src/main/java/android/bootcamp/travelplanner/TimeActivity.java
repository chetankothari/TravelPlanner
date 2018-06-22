package android.bootcamp.travelplanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TimeActivity extends Activity {

  public static final String TIME_RESULT = "android.bootcamp.travelplanner.TIME_RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);


        Intent intent = getIntent();
        String message = intent.getStringExtra(TIME_RESULT);

        TextView textView = findViewById(R.id.time_new_activity);
        textView.setText(message);
    }

  public void calculate(View view) {
    EditText bufferEdit = findViewById(R.id.buffer);
    String bufferString = bufferEdit.getText().toString();
    int buffer = Integer.parseInt(bufferString);

    TextView timeText = findViewById(R.id.time_new_activity);
    String timeString = timeText.getText().toString();
    int time = Integer.parseInt(timeString);

    int bufferedTime = buffer + time;
    String strResult = String.valueOf(bufferedTime);

    Intent intent = new Intent();
    intent.putExtra(TravelPlannerActivity.BUFFERED_TIME, strResult);
    setResult(RESULT_OK, intent);
    finish();
  }
}
