package comsci.kwan.animalforfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static comsci.kwan.animalforfun.R.id.btnstart;

public class MainActivity extends AppCompatActivity {

    //Explicit
    String  nameString ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(btnstart);
        final EditText editText = (EditText) findViewById(R.id.txtName);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (editText.length() == 0) { //ถ้า edittext ว่าง คือยังไม่กรอกชื่อ
                    Toast.makeText(getApplicationContext(), "Please Enter Your Name !", Toast.LENGTH_SHORT).show();

                } else {
                    nameString = editText.getText().toString().trim();

                Toast.makeText(getApplicationContext(), "Hello " + nameString, Toast.LENGTH_SHORT).show();

                Intent startIntent = new Intent(MainActivity.this, Game.class);
                startActivity(startIntent);
                }

            }
        });


    }
}
