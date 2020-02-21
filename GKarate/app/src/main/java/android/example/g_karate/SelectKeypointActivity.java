package android.example.g_karate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectKeypointActivity extends AppCompatActivity {

    private String selectedHand;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_keypoint);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);

        intent = new Intent(this, ExerciseSummary.class);

        intent.putExtra("hand", getIntent().getStringExtra("hand"));
        intent.putExtra("name", getIntent().getStringExtra("name"));
        intent.putExtra("description", getIntent().getStringExtra("description"));


        selectedHand = getIntent().getStringExtra("hand");
        Toast.makeText(SelectKeypointActivity.this, "Selecteer waar de "+ getTranslatedSelectedHand(selectedHand) +" naar toe gaat", Toast.LENGTH_LONG).show();




        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button1.getText().toString());

                startActivity(intent);

            }
        });


        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button2.getText().toString());

                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button3.getText().toString());

                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button4.getText().toString());

                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button5.getText().toString());

                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button6.getText().toString());

                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button7.getText().toString());

                startActivity(intent);

            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent.putExtra("keypoint", getIntent().getStringExtra("hand")+ button8.getText().toString());

                startActivity(intent);

            }
        });



    }


        private String getTranslatedSelectedHand(String selectedHand){
            if(selectedHand.equals("left")){
                return "linker hand";
            }else{
                return "rechter hand";
            }
        }









}
