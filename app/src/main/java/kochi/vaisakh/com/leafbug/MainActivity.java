package kochi.vaisakh.com.leafbug;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressbar1;
    TextView t;
   // ImageView i;
    TextView mTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       setTheme(R.style.notitle);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  i = (ImageView) findViewById(R.id.i2);
        progressbar1 = (ProgressBar) findViewById(R.id.p);
        t = (TextView) findViewById(R.id.t2);
        mTextField = (TextView) findViewById(R.id.time);


        new  CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext


                //commit
            }
            //egrgrgr


        public void onFinish() {
            mTextField.setText("done!");
            Intent i=new Intent(MainActivity.this,LeafBug.class);
            startActivity(i);
            finish();

        }

        //time counter doesnt work

}.start();

// checking
        //wgwgrwgwr
    }
}

