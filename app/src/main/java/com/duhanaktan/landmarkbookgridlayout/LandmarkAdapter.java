package com.duhanaktan.landmarkbookgridlayout;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.duhanaktan.landmarkbookgridlayout.databinding.RecycleCellBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    ArrayList<Landmark> landmarkArrayList;

    public LandmarkAdapter(ArrayList<Landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecycleCellBinding recycleCellBinding=RecycleCellBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new LandmarkHolder(recycleCellBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {
        holder.binding.mainName.setText(landmarkArrayList.get(position).name);
        holder.binding.mainImage.setImageResource(landmarkArrayList.get(position).image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{
        private RecycleCellBinding binding;
        public LandmarkHolder(RecycleCellBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
