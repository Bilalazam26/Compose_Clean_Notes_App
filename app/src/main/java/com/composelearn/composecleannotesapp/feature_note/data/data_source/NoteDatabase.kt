package com.composelearn.composecleannotesapp.feature_note.data.data_source

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.composelearn.composecleannotesapp.feature_note.domain.model.entities.*

@Database(entities = [
    Note::class
                     ]
    , version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        fun noteDatabaseInstance(context: Context): NoteDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                NoteDatabase::class.java,
                "notes_db"
            ).build()
        }
    }
}