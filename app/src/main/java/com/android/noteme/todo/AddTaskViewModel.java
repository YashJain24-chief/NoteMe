package com.android.noteme.todo;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.android.noteme.todo.database.AppDatabase;
import com.android.noteme.todo.database.TaskEntry;


public class AddTaskViewModel extends ViewModel {


    private LiveData<TaskEntry> task;


    // Note: The constructor should receive the database and the taskId
    public AddTaskViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }


    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
