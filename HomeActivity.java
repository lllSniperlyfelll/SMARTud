package com.example.smartud;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private EditText name;
    Button ok;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        name = (EditText)findViewById(R.id.inputage);
        ok = (Button)this.findViewById(R.id.submitbtn);

        username = name.getText().toString();

        //ok.setOnClickListener(okListener);
        final Button button = findViewById(R.id.submitbtn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Context context = getApplicationContext();

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, username, duration);
                toast.show();
            }
        });

    }
}
