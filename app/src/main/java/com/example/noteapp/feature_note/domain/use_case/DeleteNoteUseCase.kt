package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NotesRepository

class DeleteNoteUseCase(
    private val repository: NotesRepository,
) {
    suspend operator fun invoke(note: Note) = repository.deleteNote(note)
}
