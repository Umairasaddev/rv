package com.example.rv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private final List<MyModel> list;
    private Context context;
    private SelectListner listner;



    public CustomAdapter(Context context, List<MyModel> list) {
        this.context = context;
        this.list = list;
        this.listner = listner;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.single_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {


        holder.textName.setText(list.get(position).getName());
        holder.textAge.setText(String.valueOf(list.get(position).getAge()));

    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            listner.onItemClicked(list.get(position));
        }
    });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
