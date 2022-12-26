package com.noteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.noteapp.adapters.NotesAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button bt_add;
    RecyclerView recyclerListNotes;
    public static ArrayList<String> lstNotes = new ArrayList<>();

    NotesAdapter notesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_add = findViewById(R.id.bt_add);
        recyclerListNotes = findViewById(R.id.recycler_listNotes);
        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intent);
            }
        });

        recyclerListNotes.setLayoutManager(new LinearLayoutManager(this));
        notesAdapter = new NotesAdapter(lstNotes);
        recyclerListNotes.setAdapter(notesAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        notesAdapter = new NotesAdapter(lstNotes);
        recyclerListNotes.setAdapter(notesAdapter);
    }
}