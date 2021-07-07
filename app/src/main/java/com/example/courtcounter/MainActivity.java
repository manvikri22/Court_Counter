package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String x =" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeforTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoforTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addFreeforTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeforTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoforTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addFreeforTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        x = " ";
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayresult(x);
    }

    public void endbutton(View view) {
        if(scoreTeamB > scoreTeamA  )
        {
            x = "Winner is Team B" + "\n Congratulations!!!";
            displayresult(x);
        }
        else if(scoreTeamB < scoreTeamA )
        {
            x = "Winner is Team A" + "\n Congratulations!!!";
            displayresult(x);
        }
        else
        {
            x = "Draw Match!!";
            displayresult(x);
        }

    }

    public void displayForTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_A_score);
        scoreview.setText(String.valueOf(score));
    }

    public void displayresult(String x) {
        TextView scoreview = (TextView) findViewById(R.id.msg);
        scoreview.setText(x);
    }


    public void displayForTeamB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_B_score);
        scoreview.setText(String.valueOf(score));
    }
}