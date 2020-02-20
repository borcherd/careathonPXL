package android.example.g_karate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CoachSelectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_selection);


    }

    public void goToExerciseSelection(View view){
        Intent intent = new Intent(this, ExerciseSelectionActivity.class);
        startActivity(intent);
    }
    public void goToNewExercise(View view){
        Intent intent = new Intent(this, NewExercise1Activity.class);
        startActivity(intent);
    }

}
