package com.example.connectability;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PasswordRecoveryActivity extends AppCompatActivity {

    private EditText emailRecovery;
    private Button submitEmailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);

        emailRecovery = findViewById(R.id.emailRecovery);
        submitEmailButton = findViewById(R.id.submitEmailButton);

        submitEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here, you might want to add logic to verify the email or perform other checks
                // ...

                // Navigate to SecurityQuestionsActivity
                Intent intent = new Intent(PasswordRecoveryActivity.this, SecurityQuestionsActivity.class);
                startActivity(intent);
            }
        });
    }
}
