package ru.dvume.statepattern.state.impl;


import ru.dvume.statepattern.state.TaskState;
import ru.dvume.statepattern.task.Task;

public class DoneState implements TaskState {
    @Override
    public void start(Task task) {
        System.out.println("Задание уже выполнено");
    }

    @Override
    public void complete(Task task) {
        System.out.println("Задание уже выполнено");
    }

    @Override
    public void fail(Task task) {
        System.out.println("Задание уже выполнено");
    }
}
