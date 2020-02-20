package android.example.g_karate;

import android.example.g_karate.Models.Exercise;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSelectionActivity extends AppCompatActivity {

    List<Exercise> exercises = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersice_selection);

        getDataFromFirebase();
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
                                String name = document.get("name").toString();
                                String description = document.get("description").toString();
                                String nameSport = document.get("nameSport").toString();
                                List<String> moves = (List<String>) document.get("moves");
                                int difficulty = Math.toIntExact((long)document.get("difficulty"));
                                List<String> accessibleDisabilities = (List<String>) document.get("accessibleDisabilities");

                                Exercise exercise = new Exercise(id, name, description, nameSport, moves, difficulty, accessibleDisabilities);
                                exercises.add(exercise);

                            }
                        } else {
                            Log.d("1", "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

    public void fillRecyclerView(){

    }
}
