package com.example.courtcounter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //___________________________________Team A Buttons_________________________________________
        Button btnAddScoreAByThree = findViewById(R.id.btn_add3_A);
        btnAddScoreAByThree.setOnClickListener(this);
        Button btnAddScoreAByTwo = findViewById(R.id.btn_add2_A);
        btnAddScoreAByTwo.setOnClickListener(this);
        Button btnAddScoreAByOne = findViewById(R.id.btn_add1_A);
        btnAddScoreAByOne.setOnClickListener(this);
        Button deleteOneFromTheAScore = findViewById(R.id.btn_delOne_A);
        deleteOneFromTheAScore.setOnClickListener(this);
        //___________________________________Team B Buttons_________________________________________
        Button btnAddScoreBByThree = findViewById(R.id.btn_add3_B);
        btnAddScoreBByThree.setOnClickListener(this);
        Button btnAddScoreBByTwo = findViewById(R.id.btn_add2_B);
        btnAddScoreBByTwo.setOnClickListener(this);
        Button btnAddScoreBByOne = findViewById(R.id.btn_add1_B);
        btnAddScoreBByOne.setOnClickListener(this);
        Button deleteOneFromTheBScore = findViewById(R.id.btn_delOne_B);
        deleteOneFromTheBScore.setOnClickListener(this);
        //_________________________________Reset Button_____________________________________________
        Button resetBtn = findViewById(R.id.btn_reset);
        resetBtn.setOnClickListener(this);
        //__________________________________________________________________________________________
    }

    //___________________Override onclick method from onClickListener interface_____________________
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_add3_A:
                scoreA = scoreA + 3;
                TextView scoreViewThree = findViewById(R.id.team_a_score);
                scoreViewThree.setText(String.valueOf(scoreA));
                break;
            case R.id.btn_add2_A:
                scoreA = scoreA + 2;
                TextView scoreViewTwo = findViewById(R.id.team_a_score);
                scoreViewTwo.setText(String.valueOf(scoreA));
                break;
            case R.id.btn_add1_A:
                scoreA ++;
                TextView scoreViewOne = findViewById(R.id.team_a_score);
                scoreViewOne.setText(String.valueOf(scoreA));
                break;
            case R.id.btn_delOne_A:
                if (scoreA > 0) {
                    scoreA--;
                    TextView scoreView = findViewById(R.id.team_a_score);
                    scoreView.setText(String.valueOf(scoreA));
                }
                break;
            case R.id.btn_add3_B:
                scoreB = scoreB + 3;
                TextView scoreViewThreeB = findViewById(R.id.score_team_b);
                scoreViewThreeB.setText(String.valueOf(scoreB));
                break;
            case R.id.btn_add2_B:
                scoreB = scoreB + 2;
                TextView scoreViewTwoB = findViewById(R.id.score_team_b);
                scoreViewTwoB.setText(String.valueOf(scoreB));
                break;
            case R.id.btn_add1_B:
                scoreB ++;
                TextView scoreViewOneB = findViewById(R.id.score_team_b);
                scoreViewOneB.setText(String.valueOf(scoreB));
                break;
            case R.id.btn_delOne_B:
                if (scoreB > 0) {
                    scoreB--;
                    TextView scoreViewB = findViewById(R.id.score_team_b);
                    scoreViewB.setText(String.valueOf(scoreB));
                }
                break;
            default:
                scoreA = 0;
                scoreB = 0;
                TextView scoreViewRe = findViewById(R.id.team_a_score);
                scoreViewRe.setText(String.valueOf(0));
                TextView scoreViewR2 = findViewById(R.id.score_team_b);
                scoreViewR2.setText(String.valueOf(scoreB));
        }
    }
}