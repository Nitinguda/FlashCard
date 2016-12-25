package edu.niu.cs.z1760203.flashcard;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ansBtn = (Button)findViewById(R.id.answerButton);
        ansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showAns = new Intent(MainActivity.this, AnswerActivity.class);
                startActivity(showAns);
                overridePendingTransition(R.anim.answer_on, R.anim.question_off);
            }
        });

    }
}
