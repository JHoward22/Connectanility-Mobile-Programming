package com.example.connectability;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend); // Corrected layout resource ID

        Button btnProfile1 = findViewById(R.id.btn_profile1);
        Button btnProfile2 = findViewById(R.id.btn_profile2);
        Button btnProfile3 = findViewById(R.id.btn_profile3);

        btnProfile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FriendsActivity.this, activity_profile2.class));
            }
        });

        btnProfile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FriendsActivity.this,
                        activity_profile3.class));
            }
        });

        btnProfile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FriendsActivity.this, activity_profile4.class));
            }
        });
    }
}
