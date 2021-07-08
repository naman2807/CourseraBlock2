package com.example.courserablock2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView animalList = findViewById(R.id.animalListView);
        ArrayAdapter<CharSequence> animalAdapter = ArrayAdapter.createFromResource(this, R.array.animalsArray,
                android.R.layout.simple_list_item_1);
    }
}