package com.noteapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.noteapp.R;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.MyViewHandler> {

    public ArrayList<String> lstOfNotes;

    public NotesAdapter(ArrayList<String> stringArrayList) {
        lstOfNotes = stringArrayList;
    }

    @NonNull
    @Override
    public MyViewHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notes, parent, false);
        return new MyViewHandler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHandler holder, int position) {

        String noteItems = lstOfNotes.get(position);
        if (noteItems != null)
        {
            holder.txt_notes.setText(noteItems);
        }

    }

    @Override
    public int getItemCount() {
        return lstOfNotes.size();
    }

    class MyViewHandler extends RecyclerView.ViewHolder {
        TextView txt_notes;

        public MyViewHandler(@NonNull View itemView) {
            super(itemView);
            txt_notes = itemView.findViewById(R.id.txt_notes);
        }
    }
}
