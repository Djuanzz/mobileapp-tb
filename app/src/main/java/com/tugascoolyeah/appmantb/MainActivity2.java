package com.tugascoolyeah.appmantb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private ImageButton reminderbtn1, reminderbtn2, takequizbtn1, takequizbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        reminderbtn1 = findViewById(R.id.reminderbtn1);
        reminderbtn2 = findViewById(R.id.reminderbtn2);
        takequizbtn1 = findViewById(R.id.takequizbtn1);
        takequizbtn2 = findViewById(R.id.takequizbtn2);

        reminderbtn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, ReminderActivity.class);
            startActivity(intent);
        });

        reminderbtn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, ReminderActivity.class);
            startActivity(intent);
        });

        takequizbtn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, QuizStart.class);
            startActivity(intent);
        });

        takequizbtn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, QuizStart.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
