package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreteama=0;

    public void addthreeteama(View view) {
        scoreteama=scoreteama+3;
        displayForTeamA(scoreteama);
    }
    public void addtwoteama(View view) {
        scoreteama=scoreteama+2;
        displayForTeamA(scoreteama);
    }
    public void addoneteama(View view) {
        scoreteama=scoreteama+1;
        displayForTeamA(scoreteama);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    int scoreteamb=0;

    public void addthreeteamb(View view) {
        scoreteamb=scoreteamb+3;
        displayForTeamB(scoreteamb);
    }
    public void addtwoteamb(View view) {
        scoreteamb=scoreteamb+2;
        displayForTeamB(scoreteamb);
    }
    public void addoneteamb(View view) {
        scoreteamb=scoreteamb+1;
        displayForTeamB(scoreteamb);
    }

    public void resetScore(View view){
        scoreteama=0;
        scoreteamb=0;
        displayForTeamA(scoreteama);
        displayForTeamB(scoreteamb);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
