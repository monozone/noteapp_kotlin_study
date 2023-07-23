package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.domain.repository.NotesRepository

class GetNoteUseCase(
    private val repository: NotesRepository,
) {
    suspend operator fun invoke(id: Int) = repository.getNoteById(id)
}
