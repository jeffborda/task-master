package com.example.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.taskmaster.R;
import com.example.taskmaster.models.Project;

import java.util.List;

public class ViewProjects extends AppCompatActivity {

    private List<Project> serverDatabase;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter projectAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_projects);
        renderRecycler();
    }


    public void renderRecycler() {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        // Use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Define an adapter
        // TODO: need to pull from Firestore database
        //projectAdapter = new ProjectAdapter();
        recyclerView.setAdapter(projectAdapter);

    }
}
