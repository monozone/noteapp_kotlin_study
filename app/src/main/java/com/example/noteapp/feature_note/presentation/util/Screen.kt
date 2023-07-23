package com.example.noteapp.feature_note.presentation.util

sealed class Screen(val routes: String) {
    object NotesScreen : Screen("notes_screen")
    object AddEditNoteScreen : Screen("add_edit_note_screen")
}