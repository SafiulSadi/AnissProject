package com.example.safiul.anissproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView ageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = (TextView) findViewById(R.id.nameTextViewId);
        ageTextView = (TextView) findViewById(R.id.ageTextViewId);

        nameTextView.setText("Suparna Bhattacharjee");
        ageTextView.setText("25 years old");

    }
}
