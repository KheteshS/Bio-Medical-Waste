package com.ksrp.solidwastemanagement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeadingsAdapter extends RecyclerView.Adapter<HeadingsAdapter.headingVH> {

    List<Headings> headingsList;

    public HeadingsAdapter(List<Headings> headingsList) {
        this.headingsList = headingsList;
    }

    @NonNull
    @Override
    public headingVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        return new headingVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull headingVH holder, int position) {

        Headings headings = headingsList.get(position);
        holder.heading.setText(headings.getHead());
        holder.description.setText(headings.getDescription());

        boolean isExpandable = headingsList.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return headingsList.size();
    }

    public class headingVH extends RecyclerView.ViewHolder {

        TextView heading,description;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;

        public headingVH(@NonNull View itemView) {
            super(itemView);

            heading = itemView.findViewById(R.id.heading);
            description = itemView.findViewById(R.id.description);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Headings h = headingsList.get(getAdapterPosition());
                    h.setExpandable(!h.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
