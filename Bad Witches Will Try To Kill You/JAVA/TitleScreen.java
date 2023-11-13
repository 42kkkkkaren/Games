package com.example.adventuregameinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        //Button Code
        //Button startB = (Button)findViewById(R.id.startButton);
        //startB.setText("Hello");
        //Title Code
        //TextView titleT = (TextView)findViewById(R.id.titleTextView);
        //titleT.setText("Bad witches will try to kill you");
    }
    public void goGameScreen(View view){
        Intent gameScreen = new Intent(this, GameScreen.class);
        startActivity(gameScreen);
    }
}