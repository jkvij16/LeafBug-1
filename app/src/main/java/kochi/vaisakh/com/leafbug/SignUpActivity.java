package kochi.vaisakh.com.leafbug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    Button b10;
    EditText edit;
    EditText edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        b10=(Button)findViewById(R.id.b10);
        edit=(EditText) findViewById(R.id.edit);
        edit1=(EditText) findViewById(R.id.edit1);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edit.getText().toString();
                String ph="+91"+edit1.getText().toString();
                Intent i=new Intent(SignUpActivity.this,OTPActivity.class);
                i.putExtra("namee",name);
                i.putExtra("phh",ph);
                startActivity(i);
            }
        });
    }
}
