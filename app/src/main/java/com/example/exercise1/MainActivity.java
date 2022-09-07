package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// Added a new comment!

// I wrote a NEW feature here :)
// I improved feature again

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void disable(View v){

        View myView = findViewById(R.id.button4);
        myView.setEnabled(false);
        Button b = (Button) myView;
        b.setText("new Disabled");

        /*
        v.setEnabled(false);
        Log.d("success", "Button Disabled");
        Button button = (Button) v;
        button.setText("Disabled");
        */
    }
    public void disable2(View v){
        View myView2 = findViewById(R.id.button5);
        myView2.setEnabled(false);
        Button b2 = (Button) myView2;
        b2.setText("Congragulations!");

    }
    public void launchSettings (View n){
        //launch a new activity

        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

    public void handle(View a){
       EditText t = findViewById(R.id.source);
       String input = t.getText().toString();
       ((TextView)findViewById(R.id.output)).setText( input );
        Toast.makeText( this, input , Toast.LENGTH_LONG).show();
    }

}


