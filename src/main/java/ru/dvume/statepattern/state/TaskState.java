package ru.dvume.statepattern.state;


import ru.dvume.statepattern.task.Task;

public interface TaskState {
    void start(Task task);

    void complete(Task task);

    void fail(Task task);
}
