package com.tugascoolyeah.appmantb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KeluhanActivity extends AppCompatActivity {

    private Button lastClickedButton = null;
    private Button sendDoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_keluhan);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sendDoctor = findViewById(R.id.btn_kirim);
        sendDoctor.setOnClickListener(v -> {
            Intent intent = new Intent(KeluhanActivity.this, MainActivity2.class);
            startActivity(intent);
        });

        int[] buttonIds = {
                R.id.btn_batuk,
                R.id.btn_mual,
                R.id.btn_ruam,
                R.id.btn_demam,
                R.id.btn_gatal,
                R.id.btn_tidaknafsu,
                R.id.btn_kabur,
                R.id.btn_nyeri,
                R.id.btn_keringat,
                R.id.btn_depresi,
                R.id.btn_kesemutan,
                R.id.btn_punggung,
                R.id.btn_urine,
                R.id.btn_pendengaran
        };

        for (int id : buttonIds) {
            Button button = findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (lastClickedButton == button) {
                        button.setBackgroundTintList(
                                ContextCompat.getColorStateList(KeluhanActivity.this, R.color.white)
                        );
                        button.setTextColor(ContextCompat.getColor(KeluhanActivity.this, android.R.color.black));
                        lastClickedButton = null;
                    } else {
                        if (lastClickedButton != null) {
                            lastClickedButton.setBackgroundTintList(
                                    ContextCompat.getColorStateList(KeluhanActivity.this, R.color.selected)
                            );
                            lastClickedButton.setTextColor(ContextCompat.getColor(KeluhanActivity.this, android.R.color.black));
                        }

                        button.setBackgroundTintList(
                                ContextCompat.getColorStateList(KeluhanActivity.this, R.color.selected)
                        );
                        button.setTextColor(ContextCompat.getColor(KeluhanActivity.this, android.R.color.white));

                        lastClickedButton = button;
                    }
                }
            });
        }
    }
}
