package com.example.connectability; // Add the package statement at the beginning

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnSignIn, btnCreateAccount, btnForgotPassword, btnOpenWebLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);
        btnForgotPassword = findViewById(R.id.btnForgotPassword);
        btnOpenWebLink = findViewById(R.id.btnOpenWebLink);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement your sign-in logic here
                // For now, we'll just navigate to the ProfileActivity
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to CreateAccountActivity
                startActivity(new Intent(MainActivity.this, CreateAccountActivity.class));
            }
        });

        btnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to PasswordRecoveryActivity
                startActivity(new Intent(MainActivity.this, PasswordRecoveryActivity.class));
            }
        });

        btnOpenWebLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the web link URL
                String webLinkUrl = "https://github.com/JHoward22/Connectanility-Mobile-Programming/tree/main/connectability";

                // Create an Intent to open the web link in a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webLinkUrl));
                startActivity(intent);
            }
        });
    }
}
