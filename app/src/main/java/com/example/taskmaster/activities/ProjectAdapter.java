package com.example.taskmaster.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.taskmaster.R;
import com.example.taskmaster.models.Project;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {


    private List<Project> projects;



    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ProjectViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View mView;
        public TextView title;
        public TextView description;
        public TextView quantity;
        public TextView timestamp;



        public ProjectViewHolder(View v) {
            super(v);
            mView = v;
            // TODO: set the id's for the TextView that each Project field will be added to
//            title = (TextView) v.findViewById(R.id.exercise_title_output);
//            description = (TextView) v.findViewById(R.id.exercise_description_output);
//            quantity = (TextView) v.findViewById(R.id.exercise_quantity_output);
//            timestamp = (TextView) v.findViewById(R.id.exercise_timestamp_output);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ProjectAdapter(List<Project> myDataset) {

        projects = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ProjectAdapter.ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_exercise, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ProjectViewHolder vh = new ProjectViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.title.setText(projects.get(position).title);
        holder.description.setText(projects.get(position).description);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return projects.size();
    }

}
