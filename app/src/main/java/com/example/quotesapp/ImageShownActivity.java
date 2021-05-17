package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageShownActivity extends AppCompatActivity {
    private final Integer image_ids[]=
            {R.drawable.motivational1, R.drawable.motivational2, R.drawable.motivational3, R.drawable.motivational4,
                    R.drawable.motivational5, R.drawable.motivational6, R.drawable.motivational7, R.drawable.motivational8,
                    R.drawable.motivational9,R.drawable.motivational10, R.drawable.motivational11
            };
    int Value;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_shown);

        Intent intent = getIntent();
        if (getIntent().hasExtra("Value"))
        {
            String position = intent.getStringExtra("Value");
            Value = Integer.parseInt(position);
        }
        ImageView imageView = findViewById(R.id.imageview);
        imageView.setImageResource(image_ids[Value]);
    }
}