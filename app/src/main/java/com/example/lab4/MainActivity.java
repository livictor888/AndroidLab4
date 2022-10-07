package com.example.lab4;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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
        toRelative.setOnClickListener(view -> {
            Intent intent = new Intent(this, RelativeLayoutForm.class);
            startActivity(intent);
        });

        Button toLinear = findViewById(R.id.btnToLinearLayout);
        toLinear.setTextColor(Color.parseColor("black"));
        toLinear.setBackgroundColor(Color.parseColor("blue"));
        toLinear.setOnClickListener(view -> {
            Intent intent = new Intent(this, LinearLayoutForm.class);
            startActivity(intent);
        });

        Button toGrid = findViewById(R.id.btnToGridLayout);
        toGrid.setTextColor(Color.parseColor("black"));
        toGrid.setBackgroundColor(Color.parseColor("red"));
        toGrid.setOnClickListener(view -> {
            Intent intent = new Intent(this, GridLayoutForm.class);
            startActivity(intent);
        });

        Button toTable = findViewById(R.id.btnToTableLayout);
        toTable.setTextColor(Color.parseColor("black"));
        toTable.setBackgroundColor(Color.parseColor("green"));
        toTable.setOnClickListener(view -> {
            Intent intent = new Intent(this, TableLayoutForm.class);
            startActivity(intent);
        });
    }
}