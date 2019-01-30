package com.example.taskmaster.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.taskmaster.R;
import com.example.taskmaster.models.Project;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateProject extends AppCompatActivity {

    protected static final String TAG = "Create Project";
    protected List<Project> projects;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        getProjectsFromDatabase();
    }


    public void addNewProject(View v) {

        EditText titleEditText = findViewById(R.id.create_project_title);
        EditText descriptionEditText = findViewById(R.id.create_project_description);

        final String title = titleEditText.getText().toString();
        final String description = descriptionEditText.getText().toString();

        db = FirebaseFirestore.getInstance();
        // Create a new Project in db
        Map<String, Object> project = new HashMap<>();
        project.put("title", title);
        project.put("description", description);

        // Add a new document with a generated ID
        db.collection("projects")
                .add(project)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        // use documentReference.getId() to get the auto-generated id from Firebase
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());

                        Project project = new Project(documentReference.getId(), title, description);

                        TextView textView = findViewById(R.id.create_project_success_text);
                        textView.setText("Successfully added new project: " + project.title);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
    }


    public void getProjectsFromDatabase() {

    }



}
