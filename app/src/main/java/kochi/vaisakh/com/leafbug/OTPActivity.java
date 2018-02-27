package kochi.vaisakh.com.leafbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OTPActivity extends AppCompatActivity {

    String name,ph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        Bundle extras = getIntent().getExtras();
        name=extras.getString("namee");
        ph=extras.getString("phh");

    }
}
