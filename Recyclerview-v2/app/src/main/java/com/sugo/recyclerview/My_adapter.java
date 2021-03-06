package com.sugo.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class My_adapter extends RecyclerView.Adapter<My_adapter.Myviewholder> {
    Context ctx;
    String title[];
    int poster[];
    String version[];


    public My_adapter(Context ctx, String[] title, int[] poster, String[] androver) {
        this.ctx = ctx;
        this.title = title;
        this.poster = poster;
        this.version =androver;

    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.row_design, parent, false);

        return new Myviewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        holder.ver_title.setText(title[position]);
        holder.ver_numbers.setText(version[position]);
        holder.version_post.setImageResource(poster[position]);



    }

    @Override
    public int getItemCount() {
        return poster.length;
    }

    public class Myviewholder extends RecyclerView.ViewHolder {
        ImageView version_post;
        TextView ver_title;
        TextView ver_numbers;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            version_post=itemView.findViewById(R.id.suimg);
            ver_title=itemView.findViewById(R.id.tv_version);
            ver_numbers=itemView.findViewById(R.id.tv_v);

        }
    }
}
