package com.amikom.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button bts= (Button) findViewById(R.id.button2);
        Button btn= (Button) findViewById(R.id.button1);

        bts.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, secondactivity.class);
                startActivity(i);
            }
        });



    }
}
