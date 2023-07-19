package com.composelearn.composecleannotesapp.feature_note.domain.use_case

import com.composelearn.composecleannotesapp.feature_note.domain.model.entities.Note
import com.composelearn.composecleannotesapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {repository.deleteNote(note)}
}