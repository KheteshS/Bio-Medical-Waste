package com.ksrp.solidwastemanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BMWActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Headings> headingsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmwactivity);

        recyclerView = findViewById(R.id.bmwRecyclerView);

        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        HeadingsAdapter headingsAdapter = new HeadingsAdapter(headingsList);
        recyclerView.setAdapter(headingsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        headingsList = new ArrayList<>();

        headingsList.add(new Headings("Introduction","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("BMW rule 1998 / training","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Problems associated with BMW","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Sources","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Categories","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Classfication","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Safety Precautions","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Color Coding System for Segregation of BMW","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Collection Counter","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Disposal Methods","blaghsajfdghgfhasf"));
        headingsList.add(new Headings("Measures for Waste Minimization","blaghsajfdghgfhasf"));

    }
}