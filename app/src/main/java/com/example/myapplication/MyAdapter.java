package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyRow> {

    private ArrayList<Item> arrayList;

    public MyAdapter(ArrayList<Item> al) {
       this.arrayList = al;
    }

    @NonNull
    @Override
    public MyRow onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        return new MyRow(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRow holder, int position) {
        holder.tv.setText(arrayList.get(position).getName());
        // отображение
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyRow extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView iv;
        public MyRow(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.textView);
            iv = itemView.findViewById(R.id.imageView);
        }
    }
}
