package com.android.noteme.todo;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.android.noteme.todo.database.AppDatabase;


public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {


    private final AppDatabase mDb;
    private final int mTaskId;

    public AddTaskViewModelFactory(AppDatabase database, int taskId) {
        mDb = database;
        mTaskId = taskId;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }
}
