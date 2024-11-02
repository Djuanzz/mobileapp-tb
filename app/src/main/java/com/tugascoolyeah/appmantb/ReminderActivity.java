package com.tugascoolyeah.appmantb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ReminderActivity extends AppCompatActivity {

    private ImageButton backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reminder);

        backhome = findViewById(R.id.backhome);
        backhome.setOnClickListener(v -> {
            Intent intent = new Intent(ReminderActivity.this, MainActivity2.class);
            startActivity(intent);
        });

//        MaterialButton btn = findViewById(R.id.datepicker);
//        TextView textView = findViewById(R.id.tv);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MaterialDatePicker<Long> materialDatePicker = MaterialDatePicker.Builder.datePicker()
//                        .setTitleText("Select Date")
//                        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
//                        .build();
//                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener<Long>() {
//                    @Override
//                    public void onPositiveButtonClick(Long selection) {
//                        String date = new SimpleDateFormat("MM-dd-yy", Locale.getDefault()).format(new Date(selection));
//                        textView.setText(MessageFormat.format("Selected date {0}", date));
//                    }
//                });
//                materialDatePicker.show(getSupportFragmentManager(), "tag");
//            }
//        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}