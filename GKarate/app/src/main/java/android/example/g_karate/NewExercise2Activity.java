package android.example.g_karate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewExercise2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_exercise2);


    }


    public void goToSelectKeypointRightHand(View v){
        Intent intent = new Intent(this, SelectKeypointActivity.class);
        intent.putExtra("hand", "RH");
        intent.putExtra("name", getIntent().getStringExtra("name"));
        intent.putExtra("description", getIntent().getStringExtra("description"));

        startActivity(intent);
    }

    public void goToSelectKeypointLeftHand(View v){
        Intent intent = new Intent(this, SelectKeypointActivity.class);
        intent.putExtra("hand", "LH");
        intent.putExtra("name", getIntent().getStringExtra("name"));
        intent.putExtra("description", getIntent().getStringExtra("description"));
        startActivity(intent);
    }




}
