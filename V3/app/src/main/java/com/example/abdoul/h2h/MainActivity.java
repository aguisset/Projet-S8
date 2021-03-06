package com.example.abdoul.h2h;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton BAidant;
    ImageButton BPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization

        BAidant = (ImageButton) findViewById(R.id.BAidant);
        BPatient = (ImageButton) findViewById(R.id.BPatient);

        BAidant.setOnClickListener(this);
        BPatient.setOnClickListener(this);

    }


    public void onClick(View v) {
        switch(v.getId()){
            case R.id.BAidant:
                startActivity(new Intent(this,LoginAidant.class)); // Go to the login page
                break;

            case R.id.BPatient:
                startActivity(new Intent(this,LoginPatient.class));
                break;

        }
    }
}
