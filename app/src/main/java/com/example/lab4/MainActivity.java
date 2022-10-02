package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toConstraint = findViewById(R.id.btnToConstraintLayout);
        toConstraint.setTextColor(Color.parseColor("black"));
        toConstraint.setBackgroundColor(Color.parseColor("cyan"));
        toConstraint.setOnClickListener(view -> {
            Intent intent = new Intent(this, ConstraintLayoutForm.class);
            startActivity(intent);
        });

        Button toRelative = findViewById(R.id.btnToRelativeLayout);
        toRelative.setTextColor(Color.parseColor("black"));
        toRelative.setBackgroundColor(Color.parseColor("magenta"));

        Button toLinear = findViewById(R.id.btnToLinearLayout);
        toLinear.setTextColor(Color.parseColor("black"));
        toLinear.setBackgroundColor(Color.parseColor("blue"));

        Button toGrid = findViewById(R.id.btnToGridLayout);
        toGrid.setTextColor(Color.parseColor("black"));
        toGrid.setBackgroundColor(Color.parseColor("red"));

        Button toTable = findViewById(R.id.btnToTableLayout);
        toTable.setTextColor(Color.parseColor("black"));
        toTable.setBackgroundColor(Color.parseColor("green"));
    }
}