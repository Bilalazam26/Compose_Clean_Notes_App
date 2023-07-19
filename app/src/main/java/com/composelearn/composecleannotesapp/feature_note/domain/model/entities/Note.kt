package com.composelearn.composecleannotesapp.feature_note.domain.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.composelearn.composecleannotesapp.ui.theme.BabyBlue
import com.composelearn.composecleannotesapp.ui.theme.LightGreen
import com.composelearn.composecleannotesapp.ui.theme.RedOrange
import com.composelearn.composecleannotesapp.ui.theme.RedPink
import com.composelearn.composecleannotesapp.ui.theme.Violet
import java.lang.Exception

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val title: String,
    val body: String,
    val timesTemp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }

    class InvalidNoteException(message: String): Exception(message)
}

