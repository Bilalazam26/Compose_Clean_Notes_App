package com.composelearn.composecleannotesapp.feature_note.domain.use_case

data class NoteUseCases(
    val getAllNotes: GetAllNotes,
    val insertNote: InsertNote,
    val deleteNote: DeleteNote,
    val getNote: GetNote
) {
}