package ru.dvume.statepattern.state.impl;

import ru.dvume.statepattern.state.TaskState;
import ru.dvume.statepattern.task.Task;

public class FailedState implements TaskState {
    @Override
    public void start(Task task) {
        System.out.println("Задание уже провалено");
    }

    @Override
    public void complete(Task task) {
        System.out.println("Задание уже провалено");
    }

    @Override
    public void fail(Task task) {
        System.out.println("Задание уже провалено");
    }
}
