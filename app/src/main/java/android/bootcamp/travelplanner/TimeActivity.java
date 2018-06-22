package android.bootcamp.travelplanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
}
