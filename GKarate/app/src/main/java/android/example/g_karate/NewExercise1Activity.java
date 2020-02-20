package android.example.g_karate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewExercise1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_exercise1);

    }
    public void goToNewExercise2(View view){
        Intent intent = new Intent(this, NewExercise2Activity.class);
        startActivity(intent);
    }
}
