package gr.aueb.cf.oldsplashscreenversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int TIMEOUT_MILLIS = 3000;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                // start the intent
                startActivity(i);
                // close this activity
                finish();
            }
        }, TIMEOUT_MILLIS);

    }
}