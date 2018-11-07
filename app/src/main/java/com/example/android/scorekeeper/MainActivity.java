package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int firstScore = 0;
    int secondScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void headshotFirst(View view){
        firstScore += 3;
        displayFirstScore(firstScore);
    }

    public void armLegShotFirst(View view){
        firstScore += 2;
        displayFirstScore(firstScore);
    }

    public void bodyShotFirst(View view){
        firstScore += 1;
        displayFirstScore(firstScore);
    }

    private void displayFirstScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.first_score);
        scoreView.setText(String.valueOf(score));
    }

    public void headshotSecond(View view){
        secondScore += 3;
        displaySecondScore(secondScore);
    }

    public void armLegShotSecond(View view){
        secondScore += 2;
        displaySecondScore(secondScore);
    }

    public void bodyShotSecond(View view){
        secondScore += 1;
        displaySecondScore(secondScore);
    }

    private void displaySecondScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.second_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view){
        firstScore = 0;
        secondScore = 0;
        displayFirstScore(firstScore);
        displaySecondScore(secondScore);
    }

}
