package com.composelearn.composecleannotesapp.feature_note.domain.use_case

import com.composelearn.composecleannotesapp.feature_note.domain.model.entities.Note
import com.composelearn.composecleannotesapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}