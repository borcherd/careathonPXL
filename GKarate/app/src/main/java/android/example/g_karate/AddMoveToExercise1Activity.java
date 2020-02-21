package android.example.g_karate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddMoveToExercise1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_move_to_exercise1);


    }

    public void goToSelectKeypointRightHand(View v){
        Intent intent = new Intent(this, AddMoveSelectKeypointsActivity.class);
        intent.putExtra("hand", "RH");
        intent.putExtra("name", getIntent().getStringExtra("name"));

        startActivity(intent);
    }

    public void goToSelectKeypointLeftHand(View v){
        Intent intent = new Intent(this, AddMoveSelectKeypointsActivity.class);
        intent.putExtra("hand", "LH");
        intent.putExtra("name", getIntent().getStringExtra("name"));
        startActivity(intent);
    }

}
