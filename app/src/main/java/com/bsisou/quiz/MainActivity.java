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



    // TODO: to create question bank



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        true_button = findViewById(R.id.true_button);
        false_button = findViewById(R.id.false_button);
        questionTextView = findViewById(R.id.question_text_view);
        scoreTextView = findViewById(R.id.score);
        progressBar = findViewById(R.id.progress_bar);


        true_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Quiz","Turn Button press");
                Toast tsmg = Toast.makeText(getApplicationContext(),"True clicked",Toast.LENGTH_SHORT);
                tsmg.show();
            }
        });


        false_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Quiz","False Button press");
                Toast.makeText(getApplicationContext(),"False clicked",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
