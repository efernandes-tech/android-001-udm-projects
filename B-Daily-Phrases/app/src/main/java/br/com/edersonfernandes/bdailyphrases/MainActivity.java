package br.com.edersonfernandes.bdailyphrases;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] phrases = {
        "Phrase 01",
        "Phrase 02",
        "Phrase 03",
    };

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
    }

    public void generatePhrase(View view) {
        TextView text = findViewById(R.id.textResult);

        int randomNumber = new Random().nextInt(3);

        text.setText(phrases[randomNumber]);
    }

    public void showAll(View view) {
        TextView text = findViewById(R.id.textResult);

        String resultText = "";

        for (String phrase : phrases) {
            resultText = resultText + phrase + "\n";
        }

        text.setText(resultText);
    }

}