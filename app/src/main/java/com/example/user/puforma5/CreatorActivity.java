package com.example.user.puforma5;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CreatorActivity extends AppCompatActivity {
    private List<CreatorPost> creatorPost = new ArrayList<>();
    private RecyclerView recyclerView;
    private CreatorPostAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("CREATOR PUFORMA V.0.0");

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new CreatorPostAdapter(creatorPost);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(view.getContext(), CreatePost.class);
                startActivity(intent);
            }
        });
    }

    private void prepareMovieData() {
        CreatorPost post1 = new CreatorPost("Penerimaan Beasiswa Tanoto", "Beasiswa", "2015-08-12");
        creatorPost.add(post1);
        CreatorPost post2 = new CreatorPost("Open Reqruitment Raja Brawijaya", "Kepanitiaan", "2015-03-04");
        creatorPost.add(post2);
        CreatorPost post3 = new CreatorPost("Pengumuman Sertifikasi UB", "Pengumuman", "2015-11-05");
        creatorPost.add(post3);





//        CreatorPost post = new CreatorPost("Mad Max: Fury Road", "Action & Adventure", "2015");
//        creatorPost.add(post);
//
//        CreatorPost post = new CreatorPost("Mad Max: Fury Road", "Action & Adventure", "2015");
//        creatorPost.add(post);
//
//        CreatorPost post = new CreatorPost("Mad Max: Fury Road", "Action & Adventure", "2015");
//        creatorPost.add(post);
//
//        CreatorPost post = new CreatorPost("Mad Max: Fury Road", "Action & Adventure", "2015");
//        creatorPost.add(post);

        mAdapter.notifyDataSetChanged();
    }



}
