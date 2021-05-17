package com.example.quotesapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotesapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public  class AdapterClass  extends RecyclerView.Adapter<AdapterClass.ViewHolder>
{


    private ArrayList<ImageList> galleryList;
    private Context context;

    public AdapterClass(Context context,ArrayList<ImageList> galleryList) {
        this.galleryList = galleryList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_new,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        viewHolder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Picasso.get().load(galleryList.get(i).getImage_id()).resize(300,500).into(viewHolder.imageView);


        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ImageShownActivity.class);
                intent.putExtra("Value",String.valueOf(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return galleryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);

        }
    }
}

