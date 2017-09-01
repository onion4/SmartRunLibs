package run.com.smartrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import run.com.smartrunlib.RunPedometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);
        RunPedometer runPedometer = new RunPedometer();
        tv.setText(String.valueOf(runPedometer.Peak_Valley_Thread(23.5f)));
    }
}
