package android.example.g_karate;

import android.content.Intent;
import android.example.g_karate.Models.Exercise;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewExercise1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_exercise1);



    }
    public void goToNewExercise2(View view){
        EditText nameText = (EditText)findViewById(R.id.name);
        EditText descriptionText = (EditText)findViewById(R.id.descriptionText);;



        Intent intent = new Intent(this, NewExercise2Activity.class);
        intent.putExtra("name", nameText.getText().toString());
        intent.putExtra("description", descriptionText.getText().toString());

        startActivity(intent);
    }
}
