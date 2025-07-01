package com.hilmisalsabilla.aplikasisederhana;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Setup RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        List<String> dataList = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");

        adapter = new MyAdapter(dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Setup FloatingActionButton
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Tombol FAB ditekan!", Toast.LENGTH_SHORT).show();
        });
    }
}
