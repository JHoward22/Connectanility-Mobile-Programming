package com.example.connectability;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecurityQuestionsActivity extends AppCompatActivity {

    private TextView question1, question2;
    private EditText answer1, answer2;
    private Button submitAnswersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_questions);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        submitAnswersButton = findViewById(R.id.submitAnswersButton);

        submitAnswersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic to verify answers
                // ...

                // If answers are correct, navigate to MainActivity (or another activity as needed)
                Intent intent = new Intent(SecurityQuestionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
