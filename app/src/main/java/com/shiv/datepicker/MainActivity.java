package com.shiv.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker=findViewById(R.id.datepicker);
        txt=findViewById(R.id.tv);
        btn=findViewById(R.id.button);

        Calendar calendar=Calendar.getInstance();
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);

        datePicker.init(day, month, year, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String date=dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
                txt.setText(date);
            }
        });
    }
}
