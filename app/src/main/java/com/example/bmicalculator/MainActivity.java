package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        TextView resultText = findViewById(R.id.text_view_result);

        RadioButton femaleButton = findViewById(R.id.radio_button_female);
        RadioButton maleButton = findViewById(R.id.radio_button_male);

        EditText editTextAge = findViewById(R.id.edit_text_age);
        EditText editTextFeet = findViewById(R.id.edit_text_feet);
        EditText editTextInches = findViewById(R.id.edit_text_inches);
        EditText editTextWeight = findViewById(R.id.edit_text_weight);

        Button calculateButton = findViewById(R.id.button_calculate);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "wohooo, ich kann button clicks machen", Toast.LENGTH_LONG).show();            }
        });

    }
}