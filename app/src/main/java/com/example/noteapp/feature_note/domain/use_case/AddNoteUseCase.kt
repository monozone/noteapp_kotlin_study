package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.domain.model.InvalidNoteException
import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NotesRepository

class AddNoteUseCase(
    private val repository: NotesRepository,
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("제목을 입력해주세요.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("내용을 입력해주세요.")
        }
        repository.insertNote(note)
    }
}
