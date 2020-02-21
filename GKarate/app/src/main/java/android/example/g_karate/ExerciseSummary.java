package android.example.g_karate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.g_karate.Models.Exercise;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseSummary extends AppCompatActivity {


    private List<Exercise> exercises = new ArrayList<>();
    private FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_summary);

        Exercise firstExercise = createExercise();
        exercises.add(firstExercise);

    }


    public void saveExercises(View v){
        Map<String, Object> exercisesToSave = new HashMap<>();
        exercisesToSave.put("accessibleDisabilities", exercises.get(0).getAccessibleDisabilities());
        exercisesToSave.put("description", exercises.get(0).getDescription());
        exercisesToSave.put("difficulty", exercises.get(0).getDifficulty());
        exercisesToSave.put("moves", exercises.get(0).getMoves());
        exercisesToSave.put("name", exercises.get(0).getName());
        exercisesToSave.put("nameSport", exercises.get(0).getNameSport());


        db.collection("exercises").document()
                .set(exercisesToSave)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                    Log.d("SUCCES", "DocumentSnapshot successfully written!");


            }}).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("FAIL", "Error writing document", e);
                    }
                });


        Intent returnIntent = new Intent(this, MainActivity.class);
        startActivity(returnIntent);


    }


    private Exercise createExercise(){
        //    public Exercise( String name, String description, String nameSport, List<String> moves, int difficulty, List<String> accessibleDisabilities) {

        List<String> moves = new ArrayList<>();
        List<String> accessibleDisabilities = new ArrayList<>();

        accessibleDisabilities.add("Down");
        accessibleDisabilities.add("Autism spectrum disorder");

        moves.add(getIntent().getStringExtra("keypoint"));

        return new Exercise(getIntent().getStringExtra("name"),getIntent().getStringExtra("description"), "karate",moves, 2,accessibleDisabilities );

    }

}
