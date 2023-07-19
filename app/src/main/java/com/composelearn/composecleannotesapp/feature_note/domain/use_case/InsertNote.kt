package com.composelearn.composecleannotesapp.feature_note.domain.use_case

import com.composelearn.composecleannotesapp.feature_note.domain.model.entities.Note
import com.composelearn.composecleannotesapp.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class InsertNote(
    private val repository: NoteRepository
) {
    @Throws(Note.InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw Note.InvalidNoteException("The Note Title cannot be empty!")
        }
        if (note.body.isBlank()) {
            throw Note.InvalidNoteException("Cannot insert empty Note!")
        }
        repository.insertNote(note)
    }
}