package android.example.g_karate;

import android.example.g_karate.Models.Exercise;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ExerciseSelectionActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Exercise> exercises = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersice_selection);

        getDataFromFirebase();

        final Button myButton = findViewById(R.id.refreshButton);

        myButton.setEnabled(false);

        Timer buttonTimer = new Timer();
        buttonTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        myButton.setEnabled(true);
                    }
                });
            }
        }, 6000);

    }

    public void vul(View view){
        fillRecyclerView();
    }

    public void getDataFromFirebase(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("exercises")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String id = document.getId();
                                Log.d("1", document.get("name").toString());
                                String name = document.get("name").toString();
                                String description = document.get("description").toString();
                                String nameSport = document.get("nameSport").toString();
                                List<String> moves = (List<String>) document.get("moves");
                                int difficulty = Math.toIntExact((long)document.get("difficulty"));
                                List<String> accessibleDisabilities = (List<String>) document.get("accessibleDisabilities");

                                Exercise exercise = new Exercise(id, name, description, nameSport, moves, difficulty, accessibleDisabilities);
                                exercises.add(exercise);
                                Log.d("1", document.getId());
                                Log.d("1", "net na add");
                                Log.d("1", String.valueOf(exercises.size()));


                            }
                        } else {
                            Log.d("1", "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

    public void fillRecyclerView(){
        Log.d("1", String.valueOf(exercises.size()));
        Log.d("1", String.valueOf(exercises.get(0).getName()));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(exercises);
        recyclerView.setAdapter(mAdapter);
        Log.d("1", "test");


    }
}
