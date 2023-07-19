package com.composelearn.composecleannotesapp.feature_note.presentation.notes

import com.composelearn.composecleannotesapp.feature_note.domain.model.entities.Note
import com.composelearn.composecleannotesapp.feature_note.domain.util.NoteOrder
import com.composelearn.composecleannotesapp.feature_note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
