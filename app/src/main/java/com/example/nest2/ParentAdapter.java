package com.example.nest2;

import android.content.Context;
import androidx.annotation.NonNull;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewHolder> {


    OuterList outerList;
    Context context;

    public ParentAdapter(OuterList outerList, Context context) {
        this.outerList = outerList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.parentlayout,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

            viewHolder.title.setText(outerList.getParentArrayList().get(i).getTitle());
            ChildAdapter childAdapter = new ChildAdapter(outerList.getParentArrayList().get(i).getList(),context);
            viewHolder.innerRecycle.setHasFixedSize(true);
            viewHolder.innerRecycle.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
             viewHolder.innerRecycle.setAdapter(childAdapter);
    }

    @Override
    public int getItemCount() {
        return outerList.getParentArrayList().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        RecyclerView innerRecycle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            innerRecycle = itemView.findViewById(R.id.innerRecyclerView);

        }
    }
}
