package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textOne=(TextView) findViewById(R.id.textView);
        Button clickme= (Button) findViewById(R.id.button1);

        final String[] myNames={"Ravi", "Motu", "Chinu","khan","#ht"};
        final int randoms= (int)(Math.random()*5);

        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int randoms= (int)(Math.random()*4);
                textOne.setText(myNames[randoms]);
            }
        });
    }
}