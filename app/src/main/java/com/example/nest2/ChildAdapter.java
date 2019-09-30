package com.example.nest2;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {


    ArrayList<Child> childList;
    Context context;

    public ChildAdapter(ArrayList<Child> childList, Context context) {
        this.childList = childList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.itemview,viewGroup,false);

        return new ChildAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.txt.setText(childList.get(i).getName());
        viewHolder.Img.setImageResource(childList.get(i).getImgId());

    }

    @Override
    public int getItemCount() {
        return childList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt;
        ImageView Img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt = itemView.findViewById(R.id.itemname);
            Img = itemView.findViewById(R.id.itemImage);

        }
    }
}
