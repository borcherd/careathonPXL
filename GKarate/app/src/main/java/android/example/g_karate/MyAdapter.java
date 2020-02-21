package android.example.g_karate;

import android.example.g_karate.Models.Exercise;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Exercise> exercises;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
//        public TextView id;
        public TextView name;
        public TextView description;
        public TextView nameSport;
        public TextView moves;
        public TextView difficulty;
        public TextView accessibleDisabilities;

        public MyViewHolder(@NonNull View itemview){
            super(itemview);
//            id = itemview.findViewById(R.id.idTextEdit);
            name = itemview.findViewById(R.id.nameTextEdit);
            description = itemview.findViewById(R.id.descriptionTextEdit);
            nameSport = itemview.findViewById(R.id.nameSportTextEdit);
            moves = itemview.findViewById(R.id.movesTextEdit);
            difficulty = itemview.findViewById(R.id.difficultyTextEdit);
            accessibleDisabilities = itemview.findViewById(R.id.accessibleDisabilitiesTextEdit);


        }
    }

    public MyAdapter(List<Exercise> ex){
        exercises = ex;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_model, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.name.setText(exercises.get(position).getName());
        holder.description.setText(exercises.get(position).getDescription());
        holder.nameSport.setText(exercises.get(position).getNameSport());
        holder.moves.setText(exercises.get(position).getMoves().toString());
        holder.difficulty.setText(String.valueOf(exercises.get(position).getDifficulty()));
        holder.accessibleDisabilities.setText(exercises.get(position).getAccessibleDisabilities().toString());

//        @Override
//        public void onClick(RecyclerView.ViewHolder)
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }


}
