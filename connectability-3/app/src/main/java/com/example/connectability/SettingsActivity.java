package com.example.connectability;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class SettingsActivity extends AppCompatActivity {

    private Switch switchProfileVisibility, switchNotifications;
    private SeekBar seekBarTextSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Initialize UI components
        switchProfileVisibility = findViewById(R.id.switchProfileVisibility);
        switchNotifications = findViewById(R.id.switchNotifications);
        seekBarTextSize = findViewById(R.id.seekBarTextSize);

        // Set up SharedPreferences
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        // Accessibility Settings: Text Size Adjustment
        seekBarTextSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Save the text size preference
                sharedPreferences.edit().putInt("textSize", progress).apply();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Optional
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Optional
            }
        });

        // Privacy Settings: Profile Visibility
        switchProfileVisibility.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Save the profile visibility preference
                sharedPreferences.edit().putBoolean("profileVisibility", isChecked).apply();
            }
        });

        // Notification Settings
        switchNotifications.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Save the notification preference
                sharedPreferences.edit().putBoolean("notifications", isChecked).apply();
            }
        });
    }
}
