package ru.dvume.statepattern.state.impl;


import ru.dvume.statepattern.state.TaskState;
import ru.dvume.statepattern.task.Task;

public class InProgressState implements TaskState {
    @Override
    public void start(Task task) {
        System.out.println("Задача уже запущена");
    }

    @Override
    public void complete(Task task) {
        task.setState(new DoneState());
        System.out.println("Задача завершена успешно");
    }

    @Override
    public void fail(Task task) {
        task.setState(new FailedState());
        System.out.println("Задача провалена");
    }
}
