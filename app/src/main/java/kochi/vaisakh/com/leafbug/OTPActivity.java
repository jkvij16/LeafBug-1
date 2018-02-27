package kochi.vaisakh.com.leafbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTPActivity extends AppCompatActivity {

    String name,ph;

    Button sendbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        sendbutton=(Button)findViewById(R.id.sendbutton);
        sendbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Bundle extras = getIntent().getExtras();
        name=extras.getString("namee");
        ph=extras.getString("phh");

    }
}
