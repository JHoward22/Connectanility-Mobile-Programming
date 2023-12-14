package com.example.connectability;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class PicturesActivity extends AppCompatActivity {

    private GridView gridViewPictures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        gridViewPictures = findViewById(R.id.gridViewPictures);

        // Array of image resource IDs
        int[] imageIds = {
                R.drawable.img, R.drawable.img2, R.drawable.img3,
                R.drawable.img4, R.drawable.img5, R.drawable.img6
        };

        // Set the adapter for the GridView using ImageAdapter
        gridViewPictures.setAdapter(new ImageAdapter(this, imageIds));
    }
}
