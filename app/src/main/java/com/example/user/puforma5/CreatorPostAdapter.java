package com.example.user.puforma5;

/**
 * Created by user on 11/08/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CreatorPostAdapter extends RecyclerView.Adapter<CreatorPostAdapter.MyViewHolder> {

    private List<CreatorPost> creatorPosts;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public CreatorPostAdapter(List<CreatorPost> creatorPosts) {

        this.creatorPosts = creatorPosts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.creator_post_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CreatorPost creatorPost = creatorPosts.get(position);
        holder.title.setText(creatorPost.getTitle());
        holder.genre.setText(creatorPost.getGenre());
        holder.year.setText(creatorPost.getYear());
    }

    @Override
    public int getItemCount() {
        return creatorPosts.size();
    }
}