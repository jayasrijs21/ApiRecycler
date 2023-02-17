package com.example.apirecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private List<RetroModel> retroModelList;

    public MyAdapter(List<RetroModel> retroModelList) {
        this.retroModelList = retroModelList;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        holder.tvTitle.setText(retroModelList.get(position).getTitle());
        holder.tvBody.setText(retroModelList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return retroModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle , tvBody;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle= itemView.findViewById(R.id.tvtitle);
            tvBody = itemView.findViewById(R.id.tvbody);
        }
    }
}
