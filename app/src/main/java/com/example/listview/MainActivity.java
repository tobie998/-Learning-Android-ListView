package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    // data
    String[] mobileTypes = {
            "Galaxy Note", "Mate 20 pro", "Note 9 Plus", "Note 10 plus", "Iphone X", "P30 pro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        // Array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_main, mobileTypes);
        listView.setAdapter(adapter);
    }
}