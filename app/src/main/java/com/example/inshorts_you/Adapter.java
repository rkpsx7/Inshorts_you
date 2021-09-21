package com.example.inshorts_you;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<viewHolder> {
    private List<DataModel> arrayList;
    private ItemClickListener itemClickListener;
    public Adapter(List<DataModel> arrayList, ItemClickListener itemClickListener) {
        this.arrayList = arrayList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_layout, parent, false);
        return new viewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DataModel data = arrayList.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
