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
    Button true_button;
    Button false_button;
    TextView scoreTextView;
    TextView questionTextView;
    ProgressBar progressBar;
    int index;

    int question;

    //Button




    // TODO: to create question bank
    private TrueFalse[] questionBank = new com.bsisou.quiz.TrueFalse[] {
            new TrueFalse(R.string.question_1,false),
            new TrueFalse(R.string.question_2,false),
            new TrueFalse(R.string.question_3,true),
            new TrueFalse(R.string.question_4,true),
            new TrueFalse(R.string.question_5,false),
            new TrueFalse(R.string.question_6,true),
            new TrueFalse(R.string.question_7,true),
            new TrueFalse(R.string.question_8,true),
            new TrueFalse(R.string.question_9,true),
            new TrueFalse(R.string.question_10,true),
            new TrueFalse(R.string.question_11,false),
            new TrueFalse(R.string.question_12,false),
            new TrueFalse(R.string.question_13,true),

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        true_button = findViewById(R.id.true_button);
        false_button = findViewById(R.id.false_button);
        questionTextView = findViewById(R.id.question_text_view);
        scoreTextView = findViewById(R.id.score);
        progressBar = findViewById(R.id.progress_bar);

        question = questionBank[index].getQuestionID();
        questionTextView.setText(question);


        true_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Quiz","Turn Button press");
                Toast tsmg = Toast.makeText(getApplicationContext(),"True clicked",Toast.LENGTH_SHORT);
                tsmg.show();
                updateQuestion();
            }
        });


        false_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Quiz","False Button press");
                Toast.makeText(getApplicationContext(),"False clicked",Toast.LENGTH_SHORT).show();
                updateQuestion();
            }
        });


    }

    private void updateQuestion(){
        index+=1;
        question = questionBank[index].getQuestionID();
        questionTextView.setText(question);

    }

}
