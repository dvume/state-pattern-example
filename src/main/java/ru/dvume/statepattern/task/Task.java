package ru.dvume.statepattern.task;

import ru.dvume.statepattern.state.TaskState;
import ru.dvume.statepattern.state.impl.InQueueState;

public class Task {
    private TaskState state;

    public Task() {
        state = new InQueueState(); // Начальное состояние
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public void start() {
        state.start(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void fail() {
        state.fail(this);
    }

    public void restart() {
        state = new InQueueState();
    }
}
