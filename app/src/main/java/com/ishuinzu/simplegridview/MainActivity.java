package com.ishuinzu.simplegridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridSimple;
    private String[] categories = {
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
            "Category 1",
    };
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridSimple = findViewById(R.id.gridSimple);

        //Array Adapter
        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                categories
        );

        //Setting Adapter
        gridSimple.setAdapter(arrayAdapter);

        //Set On Item Click Listener
        gridSimple.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked Item : " + categories[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}