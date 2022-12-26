package com.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NotesActivity extends AppCompatActivity {
    Button bt_save;
    EditText et_note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        bt_save = findViewById(R.id.bt_save);
        et_note = findViewById(R.id.et_note_value);
        bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et_note.getText().toString())) {

                    Toast.makeText(NotesActivity.this, "Enter Note", Toast.LENGTH_SHORT).show();

                } else {
                    MainActivity.lstNotes.add(et_note.getText().toString());
                    finish();
                }
            }
        });

    }
}