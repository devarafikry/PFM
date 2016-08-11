package com.example.user.puforma5;

import android.preference.PreferenceActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.List;

public class SearchSetting extends AppCompatPreferenceActivity {


    private Toolbar toolbar;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_search_setting);
//
////        toolbar = (Toolbar) findViewById(R.id.toolbarSearch);
////        setSupportActionBar(toolbar);
////
////        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
////        getSupportActionBar().setTitle("Setup Search");
//    }
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setupActionBar();
}

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.layout.activity_search_setting, target);
    }
}



















