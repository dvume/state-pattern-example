package ru.dvume.statepattern.state.impl;


import ru.dvume.statepattern.state.TaskState;
import ru.dvume.statepattern.task.Task;

public class InQueueState implements TaskState {
    @Override
    public void start(Task task) {
        System.out.println("Запускам задание");
        task.setState(new InProgressState());
    }

    @Override
    public void complete(Task task) {
        System.out.println("Задание из очереди может быть только взято в работу");
    }

    @Override
    public void fail(Task task) {
        System.out.println("Задание из очереди может быть только взято в работу");
    }
}
