package com.example.appbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreA=0;
int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void display(int scoreA) {
        TextView txA=findViewById(R.id.txA);
        txA.setText(""+scoreA);

    }

    public void p1A (View v) {
        scoreA =scoreA+1;
        display(scoreA);

    }



    public void p2A (View v) {
        scoreA =scoreA+2;
        display(scoreA);

    }
    public void p3A (View v) {
        scoreA =scoreA+3;
        display(scoreA);

    }
    private void displayb(int scoreB) {
        TextView txB=findViewById(R.id.txb);
        txB.setText(""+scoreB);
    }

    public void p1B (View v) {
        scoreB=scoreB+1;
        displayb(scoreB);

    }


    public void p2B (View v) {
        scoreB=scoreB+2;
        displayb(scoreB);

    }
    public void p3B (View v) {
        scoreB=scoreB+3;
        displayb(scoreB);

    }
    public void rest(View v){
    scoreA=0;
    scoreB=0;
    display(scoreA);
    displayb(scoreB);

    }


}