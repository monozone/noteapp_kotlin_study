package com.example.noteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNoteUseCase: GetNoteUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase,
    val getNotesUseCase: GetNotesUseCase,
)
