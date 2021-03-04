package com.bsisou.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
    Button trueButton;
    Button falseButton;
    TextView scoreTextView;
    ProgressBar prograssBar;
    TextView questionTextView;





    // TODO: to create question bank



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);
        questionTextView = findViewById(R.id.question_text_view);
        scoreTextView = findViewById(R.id.score);
        prograssBar = findViewById(R.id.progress_bar);


        trueButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Quiz","True button clicked");
                Toast tsmg = Toast.makeText(getApplicationContext(),"Ture Button Clicked", Toast.LENGTH_SHORT);
                tsmg.show();
            }
        });

        falseButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Quiz","Flase Button clicked");
                Toast.makeText(getApplicationContext(),"False Button Clicked", Toast.LENGTH_SHORT).show();

            }
        });






    }
}
