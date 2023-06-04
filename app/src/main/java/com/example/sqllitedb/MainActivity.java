package com.example.sqllitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        DbHandler handler = new DbHandler(this, "empdb", null, 1);
        // handler.addEmployee(new Employee(10, "Harry", 33.3));
        handler.getEmployee(1);
        textView.setText(handler.getRtn());
        handler.close();
    }
}