package com.ewig.recyclerviewactivities;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ewig.recyclerviewactivities.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandMarkAdapter extends RecyclerView.Adapter <LandMarkAdapter.LandMarkHolder>{
    ArrayList<LandMark> landMarkArrayList;

    public LandMarkAdapter(ArrayList<LandMark> landMarkArrayList) {
        this.landMarkArrayList = landMarkArrayList;

    }



    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,false);
        return new LandMarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkAdapter.LandMarkHolder holder, int position) {
    holder.binding.textRowView.setText(landMarkArrayList.get(position).name);

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(holder.itemView.getContext(), Details2.class);
           /* intent.putExtra("landmark",landMarkArrayList.get(holder.getAdapterPosition())); */
           Singleton singleton= Singleton.getInstance();
           singleton.setSentLandMark(landMarkArrayList.get(holder.getAdapterPosition()));
            holder.itemView.getContext().startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return landMarkArrayList.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public LandMarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}