package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final Integer image_ids[]=
            {R.drawable.motivational1, R.drawable.motivational2, R.drawable.motivational3, R.drawable.motivational4,
                    R.drawable.motivational5, R.drawable.motivational6, R.drawable.motivational7, R.drawable.motivational8,
                    R.drawable.motivational9,R.drawable.motivational10, R.drawable.motivational11

            };
    private Object Integer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ImageList> imageLists = prepareData();
        AdapterClass adapter = new AdapterClass(getApplicationContext(),imageLists);
        recyclerView.setAdapter( adapter);
    }

    private ArrayList<ImageList> prepareData()
    {
        ArrayList<ImageList> theImage = new ArrayList<>();
        for(int i=0;i<image_ids.length;i++)
        {
            ImageList imageLists;
            imageLists = new ImageList();
            imageLists.setImage_id(image_ids[i]);
            theImage.add(imageLists);
        }
        return theImage;
    }



}