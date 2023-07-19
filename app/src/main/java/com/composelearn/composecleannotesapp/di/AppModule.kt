package com.composelearn.composecleannotesapp.di

import android.app.Application
import com.composelearn.composecleannotesapp.feature_note.data.data_source.NoteDatabase
import com.composelearn.composecleannotesapp.feature_note.data.repository.NoteRepositoryImpl
import com.composelearn.composecleannotesapp.feature_note.domain.repository.NoteRepository
import com.composelearn.composecleannotesapp.feature_note.domain.use_case.DeleteNote
import com.composelearn.composecleannotesapp.feature_note.domain.use_case.GetAllNotes
import com.composelearn.composecleannotesapp.feature_note.domain.use_case.GetNote
import com.composelearn.composecleannotesapp.feature_note.domain.use_case.InsertNote
import com.composelearn.composecleannotesapp.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return NoteDatabase.noteDatabaseInstance(app)
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getAllNotes = GetAllNotes(repository),
            deleteNote = DeleteNote(repository),
            insertNote = InsertNote(repository),
            getNote = GetNote(repository)
        )
    }

}