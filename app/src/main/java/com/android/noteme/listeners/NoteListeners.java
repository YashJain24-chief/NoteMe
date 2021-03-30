package com.android.noteme.listeners;

import com.android.noteme.entities.Note;

public interface NoteListeners {
    void onNoteClicked(Note note, int position);
}
