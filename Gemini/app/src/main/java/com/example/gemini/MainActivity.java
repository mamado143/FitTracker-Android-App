package com.example.gemini;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set your layout file

        Button actionButton = findViewById(R.id.action_button);
        TextView resultText = findViewById(R.id.result_text);
        EditText userInput = findViewById(R.id.user_input);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = userInput.getText().toString();
                int wordCount = countWords(text);
                resultText.setText("Word count: " + wordCount);
            }
        });
    }

    private int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}